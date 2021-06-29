package com.automate.automator1;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AppTest {

static WebDriver driver;



WebDriver getDriver(String browser){
if(browser.equalsIgnoreCase("FIREFOX")) {
System.setProperty("webdriver.gecko.driver","\\automator1\\resources\\drivers\\geckodriver.exe");
driver = new FirefoxDriver();
}
else if(browser.equalsIgnoreCase("CHROME")){
	//  /automator1/resources/drivers/chromedriver.exe
//	System.setProperty("webdriver.chrome.driver","//automator1//resources//drivers//chromedriver.exe");	
System.setProperty("webdriver.chrome.driver","resources\\drivers\\chromedriver.exe");
driver = new ChromeDriver();
}
else {
	System.out.println(browser + " Browser is not defined");
}

return driver;
}

@BeforeMethod
void lauchDriverOpenURL() {
	driver = getDriver("CHROME");
	System.out.println("BeforeMethod running to create driver: " +driver);
}

@AfterMethod
void closeDriver() {
	driver.quit();
}

@Test 
void Test1() {

driver.get( "https://output.jsbin.com/usidix/1");
String pageTitle = driver.getTitle();                               	
System.out.println("Test 1 The title of this page is ===> " +pageTitle);



Assert.assertEquals("Open","Open");


}//test method


@Test
void Test2() {
driver.navigate().to("https://automationtalks.com/");
System.out.println("Test2 title: "+driver.getTitle());
}

@Test
void Test3() {
	driver.navigate().to("https://automationtalks.com/");
	System.out.println("Test3 title: "+driver.getTitle());
}

@Test
void Test4() {
	driver.navigate().to("https://automationtalks.com/");
	System.out.println("Test4 title: "+driver.getTitle());
}
	
@Test
void clickButtonCloseAlert_Test5() throws InterruptedException {

	driver.get("https://output.jsbin.com/usidix/1");
	//Fluent wait to wait for an element button to be visible
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(10))
	.pollingEvery(Duration.ofSeconds(2))
	.ignoring(Exception.class);

	WebElement btnElement = wait.until(new Function<WebDriver,WebElement>(){
		
		public WebElement apply (WebDriver driver) {
			return driver.findElement(By.xpath("//input[@type='button']"));
		}
	});
	
	//Clicking on the btnElement
	btnElement.click();
	//Switch to Alert
	// Switching to Alert        
    Alert alert = driver.switchTo().alert();
	//Get the Alert message
    String alertMessage= driver.switchTo().alert().getText();
    
    //Print Alert message
    System.out.println("Test5 alertmessage " +alertMessage);
    Thread.sleep(5000);
    //Assertion
    Assert.assertEquals(alertMessage,"This is an alert box.");
    
    //Accept alert
    alert.accept();
    
   
}
	
	
}
