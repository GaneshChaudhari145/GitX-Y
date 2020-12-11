package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException
	{
		String path=System.getProperty("user.dir");
		 prop=new Properties();
		FileInputStream fis=new FileInputStream(path+"/src/main/java/resources/config.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", path+"\\drivers\\geckodriver\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", path+"\\drivers\\iedriver\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
