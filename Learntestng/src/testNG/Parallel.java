package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
@Test
public void chrome()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Client\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
}
@Test
public void youtube()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Client\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
}
}
