package org.data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static  WebDriver driver;
	public static Actions action ;
	public static Robot robot;
	public static Alert alert; 
	public static Select refname;
	

	
	public static void chromeBrowser() {
//01
		WebDriverManager.chromedriver().setup();
		
		 driver  = new ChromeDriver();
	}
	
	public  static void edgeBrowser() {
//02
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();

	}
	
	
	
	public static void launchPageurl(String url) {
//03		
		driver.get(url);
	}
	
	public static void maxWindow() {
//04		
		driver.manage().window().maximize();

	}
	
	
	public static void pageTitle() {
//05		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
	}
	
	public static void currentUrl() {
//06		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
	}
	
	public static void fillTextBox(WebElement element ,String value) {
//07		
		element.sendKeys(value);
		
	}
	
	public static void btnClick(WebElement click) {
//08		
		click.click();
		
	}
	
	public static  void closeBrowser() {
//09		
		driver.close();
	}
	
	
	
	public static void actionmove(WebElement act) {
//10		
		action = new Actions(driver);
		action.moveToElement(act);
	}
	
	public static void draDrop(WebElement drag,WebElement drop) {
// 11		
		action = new Actions(driver);
		action.dragAndDrop(drag,drop);
	}
	
	public static void doubleclick(WebElement double1) {
//12	
		action = new Actions(driver);
		action.doubleClick(double1);
	}
	public void rightclick() {
//13	
		action = new Actions(driver);
		action.contextClick();

	}
	
	public static void keyd(String key) {
//14		
		action.keyDown(key);
	}
	
	public void keyu(String keyup) {
//15		
		action.keyUp(keyup);
	}
	
	/*public static void doubleClick(WebElement ele) {
		
		Actions a = new Actions(driver);
		
		a.doubleClick(ele);
		

	}*/
	
	public static void robotCopy() throws AWTException {
//16		
		robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);

	}
	
	public static void robotpaste() throws AWTException {
//17		
		robot = new Robot();
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);	
		
		}

//18
	
	public static void robotEnter() throws AWTException {

		robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
	
	
//19
	public static void robotCapLK() throws AWTException {
		
		robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);

	}
	
//20
	
	public static void roborShift() throws AWTException {

		robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_SHIFT);

	}
	
//21
	
	public static void robotTabKey() throws AWTException {
		
		robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		

	}
	
//22
	
	public static void robotCut() throws AWTException {
		
		robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_X);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_X);

	}
	
//23
	
	public static  void robotUndoKey() throws AWTException {
		
		robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_U);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_U);

	}
	
//25	
	public static  void robotReduKey() throws AWTException {
		
		robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_Y);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_Y);

	}
	
//26	
	public static void alertAccept() {
		
		Alert a = driver.switchTo().alert();
		
		a.accept();

	}
	
//27	
	public static void dismis() {
		
		Alert a = driver.switchTo().alert();
		
		a.dismiss();
	}
	
	
	
//28
	
	public static void screenshoot(String filename) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		File newfile = new File("C:\\\\Users\\\\emoha\\\\eclipse-workspace\\\\SeleniumProjects\\\\Screenshot"+filename);
		
		FileUtils.copyFile(file,newfile);
		
		
	}

//29
	
	public static void javaScriptSendKeys(String value,WebElement ref) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arugument[0].setAttribute('value')"+value, ref);
		
	}
	
//30	
	public void javaScriptClick(int click , WebElement ref) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arugments[0].setAttribute"+click, ref);
		

	}
	
//31	
	
	public static void javascriptGetAttribute(int get , WebElement ref) {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arugments.setAttribute"+get,ref);
		

	}
	
//32
	
	public static void selectvalue(WebElement element,String value) {
		
		 refname = new Select(element);
		
		refname.selectByValue(value);

	}
//33
	public static void selectbyVisible(WebElement element,String value) {
		
		 refname = new Select(element);
		
		refname.selectByVisibleText(value);
	}
	
//34
	
	public static void selectbyIndex(WebElement element , int value) {
		
		 refname = new Select(element);
		
		refname.selectByIndex(value);
	}
	
//35	
	public static void selectIsMultiple(WebElement element) {
		
		 refname = new Select(element);
		
		boolean multiple = refname.isMultiple();
		
		System.out.println(multiple);
	}
	
//36	
	public static void selectGetOption(WebElement element, String value) {
		
		 refname = new Select(element);
		
		List<WebElement> options = refname.getOptions();
		
		for (WebElement webElement : options) {
			
			System.out.println(webElement.getAttribute(value));
			
		}

	}
	
	
//37
	
	public static void selectAllOption(WebElement element ) {
		
		 refname = new Select(element);
		
		List<WebElement> allSelectedOptions = refname.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			
			System.out.println(webElement); 
		}
		}
//38
	
	public static void fristSelected(WebElement element) {
		
		 refname = new Select(element);
		
		refname.getFirstSelectedOption();
		
	}
	
//39
	
	public static void selectDeSelect(WebElement element) {
		
		 refname = new Select(element);
		
		refname.deselectAll();
		
	}
	
//40	
	
	public static void selectDeSelectBy(WebElement element , String value ) {
		
		 refname = new Select(element);
		
		refname.deselectByValue(value);
		
	}
	
//41
	
	public static void deSelectByVisibleText(WebElement element , String value) {
		
		 refname = new Select(element);
		
		refname.deselectByVisibleText(value);
		
	}
	
//42
	
	public static void deSelectAll(WebElement element) {
		
		 refname = new Select (element);
		
		refname.deselectAll();
		
	}
	
//43				
	
	public static void scrollDown(String value , WebElement ref) {
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scollIntoView(true)",ref);
		
		}
//44
	public static void  scrollUp(WebElement ref) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scroolIntoView(false)", ref);
		
	}
	
//45
	
	public static void navigateTo(String url) {
		
		driver.navigate().to(url);
		
	}
	
//46
	
	public static void navigateForword() {
		
		driver.navigate().forward();
	}
	
//47
	
	public static void navigateBack() {
		
		driver.navigate().back();
		
	}
	
//48
	
	public static void navigateRefresh() {
		
		driver.navigate().refresh();
		
	}
	
//49
	
	public static void frameString(String value) {
		
		driver.switchTo().frame(value);

		}
//50
	
	public static void  frameStringId(int value){
		
		driver.switchTo().frame(value);
		
	}
	
//51
	
	public static void frameStringWebElement(WebElement element) {
		
		driver.switchTo().frame(element);
	}
	
	
//52
	
	public static void switchWindowUrl(String url) {
		
		driver.switchTo().window(url);
		
	}
	
	
//53
	
	public static void switchWindowTittle(String tittle) {
		
		driver.switchTo().window(tittle);
		
	}
	
//54
	
	public static void switchWindowId(String id) {
		
		driver.switchTo().window(id);
		
	}
	
//55
	
	public static void switchDefaultWindow() {
		
		driver.switchTo().defaultContent();
		
	}
	
//56
	
	
	public static void handleWindow(WebElement element) {
		
		driver.getWindowHandle();
		
	}
	
//57
	
	public static void handleWindows(WebElement element,int val) {
		
		Set<String> window = driver.getWindowHandles();
		
		List<String> li = new ArrayList<String>();
		
		li.addAll(window);
		
		driver.switchTo().window(li.get(val));
		
		element.click();
		
	}
	
	
	public static void robotBackspace() {
		
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);

	}
	
	
//58
	
	//public static void  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
