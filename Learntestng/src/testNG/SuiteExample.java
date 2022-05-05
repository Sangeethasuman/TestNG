package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	long starttime;
	WebDriver driver;
	@BeforeSuite
	public void launchbrowser()
	{
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Client\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();		
	}
	@Test
	public void OpenGoogle()
	{
		driver.get("https://www.google.co.in/");
		
		
	}
	@Test
	public void OpenBing()
	{
		driver.get("https://www.bing.com/");
		
	}
	@Test
	public void OpenYahoo()
	{
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
	}
	@AfterSuite
	public void closebrowser()
	{
		
		driver.quit();
		long endtime=System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.println(totaltime);
		
	}
	
}
