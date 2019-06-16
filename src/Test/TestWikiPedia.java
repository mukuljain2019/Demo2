package Test;

import org.openqa.selenium.By;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestWikiPedia {
	public static void main(String args[]) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Mozilla Firefox\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Gargi\\geckodriver.exe");
		//	DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	//	capabilities.setCapability("marionette", true);
	//	WebDriver driver = new FirefoxDriver(capabilities);
		//System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer.exe");
		WebDriver driver=new FirefoxDriver();
		WebElement link;
		driver.get("http://www.wikipedia.org");
	   Thread.sleep(9000);
	link=driver.findElement(By.id("js-link-box-en"));
	//Waiting.Until(ExpectedConditions.ElementExists(By.linkText("English")));
	//  Thread.sleep(9000);
	link.click();
	Thread.sleep(9000);
	WebElement searchBox;
	searchBox=driver.findElement(By.id("searchInput"));
	searchBox.sendKeys("software");
	Thread.sleep(5000);
	driver.quit();
	}
}
