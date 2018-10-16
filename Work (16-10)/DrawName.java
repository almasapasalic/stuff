package com.qa.selenium.webdriverStuff;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class DrawName {

	ChromeDriver driver;
	
	@Before 
	public void setup() { 
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver(); 
	}
	
	@Test
	public void nameDrawing() { 
		//open website
		driver.manage().window().maximize(); 
		String url = "https://www.youidraw.com/apps/painter";
		driver.get(url);
		
		//mouse interactions for brush 
		Actions action = new Actions(driver);
		WebElement brush = driver.findElement(By.id("brush"));
		
		action.moveToElement(brush).click().perform();
		action.moveByOffset(600,100).clickAndHold().moveByOffset(0,300).release().perform();
		action.moveByOffset(0,-300).clickAndHold().moveByOffset(200,0).release().perform();
		action.moveByOffset(0,0).clickAndHold().moveByOffset(0,300).release().perform();
		action.moveByOffset(0,-150).clickAndHold().moveByOffset(-200,0).release().perform();
		
	}
}
