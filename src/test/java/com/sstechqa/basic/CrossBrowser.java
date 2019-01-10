package com.sstechqa.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void browserTest(String browser){
		
	if(browser.equalsIgnoreCase("chrome")) {
			String chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\chromeDriver\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		}
		
	else if (browser.equalsIgnoreCase("firefox")) {
		
		String firefoxDriverPath = System.getProperty("user.dir") + "\\drivers\\firefox\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
		driver = new FirefoxDriver();
		}
	
		
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	

}
