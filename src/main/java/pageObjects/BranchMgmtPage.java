package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class BranchMgmtPage extends Base{
	
	@FindBy(xpath = "//span[text()='Create a branch']") WebElement createBranchButton;
	
	@FindBy(xpath = "//input[@id='name']") WebElement nameInputBox;
	
	@FindBy(xpath = "//input[@id='address']") WebElement addressInputBox;
	
	@FindBy(xpath = "//div[text()='Save']") WebElement saveButton;
	
	@FindBy(xpath = "//div[text()='Cancel']") WebElement cancelButton;
	
	
	
	public BranchMgmtPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public void login(String name, String address){
		nameInputBox.sendKeys(name);
		addressInputBox.sendKeys(address);
		saveButton.click();
		
		//saveButton.click();
	}
}
