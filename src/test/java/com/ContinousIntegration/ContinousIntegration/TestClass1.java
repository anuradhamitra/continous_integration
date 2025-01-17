package com.ContinousIntegration.ContinousIntegration;
import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestClass1 {
	WebDriver driver;

	@BeforeMethod
	public void launchDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	}
	@Test
	public void Test1()
	{
		driver.get("https://automationtalks.com/");
		System.out.println("Test 1 title is "+driver.getTitle());
	}
	@Test
	public void Test2()
	{
		driver.get("https://automationtalks.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
	}
	@Test
	public void Test3()
	{
		driver.get("https://automationtalks.com/");
		System.out.println("Test 3 title is "+driver.getTitle());
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}