package testUI;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.BranchMgmtPage;
import resources.Base;

public class CreateBranch extends Base{

	public WebDriver driver;
	
	@BeforeTest
	public void setUp() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void createBranchTest()
	{
		BranchMgmtPage landingPage=new BranchMgmtPage();
		System.out.println(landingPage);
		System.out.println(landingPage);
		System.out.println(landingPage);
		System.out.println(landingPage);
		
		//Timezone for PST
		System.out.println(landingPage);
		System.out.println(landingPage);
		
	}
	
	@Test
	public void developTest1()
	{
		System.out.println();
	}
	
	@Test
	public void developTest2()
	{
		System.out.println();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
