package com.Prac1;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuickCheck {

	public static void main(String[] args) {		
		System.out.println("Java Vesrion no issues");		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//BrowserDrivers//chromedriver.exe");
		ChromeDriver ChromeBrow = new ChromeDriver();
		ChromeBrow.manage().window().maximize();
		System.out.println("Opened chrome Browser in max view");
		ChromeBrow.navigate().to("https://www.nissan.in/");
		String url = ChromeBrow.getCurrentUrl();
		System.out.println(url);
		
		
		
	}

}
