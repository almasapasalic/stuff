package com.qa.selenium.webdriverStuff;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class TheDemoSite {
	ChromeDriver driver;
	
	@Before 
	public void setup() { 
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver(); 
	}
	
	//@After
	//public void teardown() {
		//driver.quit(); 
	//}

	@Test 
	public void siteTest() { 
		//opens Create User page
		driver.manage().window().maximize();
		String url = "http://thedemosite.co.uk/addauser.php";
		driver.get(url);
		
		//create username
		String userInput = "userInput";
		WebElement checkUser = driver.findElement(By.name("username"));
		checkUser.sendKeys(userInput);
		
		//create password 
		String password = "password";
		WebElement checkPass = driver.findElement(By.name("password"));
		checkPass.sendKeys(password);
		
		//submit 
		WebElement submitBtn = driver.findElement(By.name("FormsButton2")); 
		submitBtn.submit();
		
		/* LOG IN */ 
		
		//opens login page
		driver.manage().window().maximize();
		String loginURL = "http://thedemosite.co.uk/login.php";
		driver.get(loginURL);
				
		//create username
		WebElement logUser = driver.findElement(By.name("username"));
		logUser.sendKeys(userInput);
				
		//create password 
		WebElement logPass = driver.findElement(By.name("password"));
		logPass.sendKeys(password);
				
		//submit 
		WebElement logIn = driver.findElement(By.name("FormsButton2")); 
		logIn.submit();
		
		WebElement checkElement = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::center[1]"));
		
		assertEquals("error", "**Successful Login**", checkElement.getText()); 
	}
}
