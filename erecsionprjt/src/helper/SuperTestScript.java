package helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class SuperTestScript {
	public static WebDriver driver;
	@BeforeTest
	public void preConfig()
	{
		String url = ExcelOperation.readData("preconfig", 1, 2);
		String Browser=ExcelOperation.readData("preconfig", 2, 2);
		System.out.println(url);
		System.out.println(Browser);
		if(Browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", ".//src//resources//drivers//geckodriver.exe");
		driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".//src//resources//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else{
			System.out.println("invalid Browser");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterTest
	public void postConfig()
	{
		driver.quit();
	}

}
