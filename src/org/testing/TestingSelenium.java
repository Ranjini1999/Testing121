package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingSelenium {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	
	}
}
