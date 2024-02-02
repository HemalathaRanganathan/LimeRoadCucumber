package com.BaseClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.tlh.ach;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	 //1 Launch Browser
		public static WebDriver launchBrowser(String browsername) {	
		if (browsername.equalsIgnoreCase("chrome")) {
					
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
					
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}	
		else if (browsername.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}	
		driver.manage().window().maximize();
		return driver;
		}
		// 2 get
		public static WebDriver launchUrl(String url) {
			driver.get(url);
			return driver;
		
		}

		// 3 close
		public static void closeBrowser() {
			driver.close();
		}

	
	// 4 Quit
	public static void terminateBrowser() {
		driver.quit();
	}
	// 5 Send Keys
	public static void passInput(WebElement element,String input) {
		element.sendKeys(input);
	}

	//6 Navigate-Forward
	public static void forwardPage() {
		driver.navigate().forward();
	}
	//7 click
	public static void clickButton(WebElement element) {
	element.click();
	}
	public static Select dropDownObject(WebElement element){
	Select s = new Select(element);
	return s;
		
	}
	 
	//8 selectbyvalue
	public static void selectByValue(WebElement element, String value) {
	dropDownObject(element).selectByValue(value);
	}
	//9 selectByindex
	public static void selectByIndex(WebElement element, int ind) {
		dropDownObject(element).selectByIndex(ind);
		
	}
	//10 selectByVisibletext
	public static void selectByText(WebElement element, String text) {
		dropDownObject(element).selectByVisibleText(text);}

	//11.navigate refresh
		public static void refreshpage() {
			driver.navigate().refresh();
		}
		
	//12. get current url

	public static void getCurrentUrl(String currenturl) {
		driver.getCurrentUrl();
		}

	//13. get text
	public static WebElement getText(WebElement element,String text) {
		element.getText();
		return element;
		}

	//14. get attribute
	public static WebElement getattribute(WebElement element,String attribute) {
		return element;}

	//15. is Multiple

	public static boolean isMultiple(WebElement element) {
		Select multi = new Select(element);
		return multi.isMultiple();
	}

	//16. get title
	public static WebDriver getTitle(String title) {
		driver.getTitle();
		return driver;
	}
	//17.TakeScreenShot

	public static void ScreenShot() {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File pic = ts.getScreenshotAs(OutputType.FILE);
	File loc = new File("path/name/format");
	try {
		FileHandler.copy(pic,  loc);
	}catch (IOException e) {
	e.printStackTrace();}}

	//18. isDisplayed
	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	// 19. isEnabled
	public static boolean isEnabled(WebElement element) {
		return element.isEnabled();}
		
	// 20. isSelected
	public static boolean isSelected(WebElement element) {
	return element.isSelected();
	}

	// 21. GetFirstSelectedoption
	public static String getFirstSelected(WebElement element,String one){
		return one;
	}

	// 22. Accept

	public static void alertAccept() {
		Alert simple = driver.switchTo().alert();
		simple.accept();}

	//23.scroll up and down
	public static void javaScript(String value) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		if(value.equals(value)) {
			js.executeScript("Window.scrollby(0,1000)");}
		else if (value.equals(value)) {
			js.executeScript("window.scrollBy(0,-500)");}}
		
		// 24.dismiss
		
	public static void alertDismiss() {
		Alert dis = driver.switchTo().alert();
		dis.dismiss();
	}
	
// Actions Class
	
public static WebDriver actionMethod(WebElement element) {
	Actions ac = new Actions(driver);
	ac.moveToElement(element).build().perform();

	return driver;
}
}
		


	


