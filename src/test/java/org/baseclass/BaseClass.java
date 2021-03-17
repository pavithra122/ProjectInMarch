package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static  WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}
	public void launchUrl(String url) {
		driver.get(url);

	}
	public void enterText(WebElement element,String value) {
		element.sendKeys(value);

	}
	
	public void btnClick(WebElement element) {
		element.click();
	}
	public void btnClear(WebElement element) {
		element.clear();
	}
	public void dragAndDrop(WebElement source,WebElement target) {
		Actions ac=new Actions(driver);
		ac.dragAndDrop(source, target);
	}
	
	//own methods
	public void rightClick(WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	public void doubleClick(WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void actionKeydownKeyUp(WebElement element,String s) {
		Actions a=new Actions(driver);
		a.keyDown(element, Keys.SHIFT).sendKeys(element, s).keyUp(element, Keys.SHIFT).perform();
	}
	
	public void alertOk() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public void alertDismiss() {
		Alert a=driver.switchTo().alert();
		a.dismiss();

	}
	public void alertSendKeys(String s1) {
		Alert a=driver.switchTo().alert();
		a.sendKeys(s1);
	}
	public String alertGetText() {
		Alert a=driver.switchTo().alert();
		String text = a.getText();
		return text;
	}
	public void printText(String text) {
		System.out.println(text);
				
	}
	public void setPropertyChrome(String location) {
		System.setProperty("webdriver.chrome.driver", location);

	}
	public void setPropertyFirefox(String location) {
		System.setProperty("webdriver.gecko.driver", location);

	}
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title; 
	}
	public void navigateBack() {
		driver.navigate().back();

	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void navigateRefresh() {
		driver.navigate().refresh();

	}
	public void urlLaunchNavigate(String url) {
		driver.navigate().to(url);

	}
	public void equalIgnoreCase(String s,String value) {
		s.equalsIgnoreCase(value);
	}
	public void equal(String s,String value) {
		s.equals(value);
	}
	public int sizeOfSet(Set<Integer> s) {
		int ss = s.size();
		return ss;
		
	}
	public String getText(WebElement w) {
		String text = w.getText();
		return text;
	}
	public void quit() {
		driver.quit();

	}
	public void close() {
		driver.close();

	}
	public void threadSleep(int value) throws InterruptedException {
		Thread.sleep(value);

	}
	public void selectByIndex(WebElement element,int index) {
		Select se=new Select(element);
		se.selectByIndex(index);
	}
	public void selectByValue(WebElement element,String value){
		Select se=new Select(element);
		se.selectByValue(value);
		
	}
	public void selectByVisibleText(WebElement element,String value) {
		Select se=new Select(element);
		se.selectByVisibleText(value);
	}
	public void screenShot(String data) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File(System.getProperty("user.dir")+"\\target\\"+data+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	public String getDataFromExcel(String pathname,String sheetName,int rowNo,int cellNo) throws IOException  {
		File file=new File(pathname);
		FileInputStream stream=new FileInputStream(file);
		Workbook workBook=new XSSFWorkbook(stream);
		Sheet sheet = workBook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		String value="";
		if(cellType==1) {
			value=cell.getStringCellValue();
			
		}else if(DateUtil.isCellDateFormatted(cell)){
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY");
			value= dateFormat.format(dateCellValue);
			
		}else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long) numericCellValue;
			value=String.valueOf(l);
		}
		return value;
	}
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
