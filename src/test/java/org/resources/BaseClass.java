package org.resources;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Workbook workbook;
	public static String value;
	public static Sheet sheet;
	public static Cell cell;
	public static Actions a;
	public static Robot r;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String siteUrl) {
		driver.get(siteUrl);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void ss(String fileNameHere) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/" + fileNameHere + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static void input(WebElement WebElementRefName, String yourInput) {
		WebElementRefName.clear();
		WebElementRefName.sendKeys(yourInput);
	}

	public static WebElement myXpath(String path) {
		return driver.findElement(By.xpath(path));

	}

	public static WebElement myId(String id) {
		return driver.findElement(By.id(id));

	}

	public static WebElement myCss(String cssSelector) {
		return driver.findElement(By.cssSelector(cssSelector));

	}

	public static WebElement myClassName(String className) {
		return driver.findElement(By.className(className));

	}

	public static WebElement myLinkText(String linkText) {
		return driver.findElement(By.linkText(linkText));

	}

	public static WebElement myTagName(String tagName) {
		return driver.findElement(By.tagName(tagName));

	}

	public static String getCurrentUrl() {
		impWait();
		return driver.getCurrentUrl();

	}

	public static void quit() {
		driver.quit();

	}

	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void goDown(WebElement elementName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elementName);
	}

	public static Actions moveToElement(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();
		return a;
	}

	public static void jclick(WebElement elementName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", elementName);
	}

}
