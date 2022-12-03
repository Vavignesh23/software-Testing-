package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public static void closeEntireBrowser() {
		driver.quit();
	}

	public static void clickBtn(WebElement ele) {
		ele.click();
	}

	public static void screenshot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location + image.png");
		FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}

	public static void dragDrop(WebElement dragweWebElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragweWebElement, dropElement).perform();
	}

	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement tarwbele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",tarwbele);
	}
	public static void scroll(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",element);
	}
	public static void excelRead(String sheetName, int rowNum, int cellNum) {
		File f = new File("excel location.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Data");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();
		String value1 = "";
		if (cellType == 1) {
			String value2 = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value1);
			String value = s.format(dd);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueof = String.valueOf(l);
		}
	}

	public static void createNewExcelFile(int rowNum, int cellNum, String writeData) throws IOException {
		File f = new File("C:\\Users\\SHRI\\eclipse-workspace\\MavenInstall\\excel\\newdata1.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newsheet = w.createSheet();
		Row newrow = newsheet.createRow(rowNum);
		Cell newcell = newrow.createCell(cellNum);
		newcell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}

	public static void createCell(int rownum, int Cellnum, String newData) throws IOException {
		File f = new File("C:\\Users\\SHRI\\eclipse-workspace\\MavenInstall\\excel\\newdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Sheet0");
		Row r = s.getRow(rownum);
		Cell c = r.createCell(Cellnum);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void createRow(int crtrow, int crtcell, String newData) throws IOException {
		File f = new File("C:\\Users\\SHRI\\eclipse-workspace\\MavenInstall\\excel\\newdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Sheet0");
		Row rw = s.createRow(crtrow);
		Cell c = rw.createCell(crtcell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void updateDataToParicularCell(int getTherow, int getThecell, String existingData,
			String writeNewData) throws IOException {
		File f = new File("C:\\Users\\SHRI\\eclipse-workspace\\MavenInstall\\excel\\newdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Sheet0");
		Row r = s.getRow(getTherow);
		Cell c = r.getCell(getThecell);
		String str = c.getStringCellValue();
		if (str.equals(existingData)) {
			c.setCellValue(writeNewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public class dataDriven extends BaseClass {
		public void main(String[] args) throws IOException {
			File f = new File("C:\\Users\\SHRI\\eclipse-workspace\\MavenInstall\\excel\\newdata.xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet newsheet = w.createSheet("New");
			Row row = newsheet.createRow(0);
			Cell cell = row.createCell(0);
			cell.setCellValue("vicky");
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
		}
		}
}
