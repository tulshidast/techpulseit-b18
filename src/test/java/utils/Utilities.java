package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {

	public static String getProperty(String key) {

		File file = new File("src/test/resources/userData.properties");
		Properties properties = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties.getProperty(key);
	}

	public static ArrayList<Object> readExcelData(String sheetName) {

		File file = new File("src/test/resources/userregistration.xlsx");

		ArrayList<Object> userData = new ArrayList<>();

		XSSFWorkbook xssfWorkbook = null;

		try {

			xssfWorkbook = new XSSFWorkbook(file);
			XSSFSheet sheet = xssfWorkbook.getSheet(sheetName);

			int lastRow = sheet.getLastRowNum();

			for (int i = 1; i <= lastRow; i++) {

				XSSFRow row = sheet.getRow(i);

				int lastCellNumber = row.getLastCellNum();

				for (int j = 0; j < lastCellNumber; j++) {

					XSSFCell cell = row.getCell(j);

					if (cell.getCellType() == CellType.NUMERIC) {
						userData.add(cell.getNumericCellValue());
					}

					if (cell.getCellType() == CellType.STRING) {
						userData.add(cell.getStringCellValue());
					}

				}

			}

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				xssfWorkbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return userData;
	}

	public static ArrayList<Object> readExcelData(String sheetName, int rowNum) {

		File file = new File("src/test/resources/userregistration.xlsx");

		ArrayList<Object> userData = new ArrayList<>();

		XSSFWorkbook xssfWorkbook = null;

		try {

			xssfWorkbook = new XSSFWorkbook(file);
			XSSFSheet sheet = xssfWorkbook.getSheet(sheetName);

			XSSFRow row = sheet.getRow(rowNum);

			int lastCellNumber = row.getLastCellNum();

			for (int j = 0; j < lastCellNumber; j++) {

				XSSFCell cell = row.getCell(rowNum);

				if (cell.getCellType() == CellType.NUMERIC) {
					userData.add(cell.getNumericCellValue());
				}

				if (cell.getCellType() == CellType.STRING) {
					userData.add(cell.getStringCellValue());
				}

			}

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				xssfWorkbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return userData;
	}

	public static LinkedHashMap<Integer, ArrayList<Object>> readCompleteExcelData(String sheetName) {

		File file = new File("src/test/resources/userregistration.xlsx");

		LinkedHashMap<Integer, ArrayList<Object>> userData = new LinkedHashMap<>();
		ArrayList<Object> rowData = null;

		XSSFWorkbook xssfWorkbook = null;

		try {

			xssfWorkbook = new XSSFWorkbook(file);
			XSSFSheet sheet = xssfWorkbook.getSheet(sheetName);

			int lastRow = sheet.getLastRowNum();

			for (int i = 1; i <= lastRow; i++) {

				XSSFRow row = sheet.getRow(i);

				int lastCellNumber = row.getLastCellNum();

				rowData = new ArrayList<>();

				for (int j = 0; j < lastCellNumber; j++) {

					XSSFCell cell = row.getCell(j);

					if (cell.getCellType() == CellType.NUMERIC) {
						rowData.add(cell.getNumericCellValue());
					}

					if (cell.getCellType() == CellType.STRING) {
						rowData.add(cell.getStringCellValue());
					}

				}

				userData.put(i, rowData);

			}

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				xssfWorkbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return userData;
	}

	public static void getScreenshot(WebDriver driver, String screenshotName) {

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,
					new File("src/test/resources/screenshoot/" + screenshotName + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<String> getAllOptionsFromDropdown(WebElement dropdownLocator) {
		List<String> options = new ArrayList<>();
		Select select = new Select(dropdownLocator);
		List<WebElement> allElements = select.getOptions();
		for (WebElement elm : allElements) {
			options.add(elm.getText());
		}

		return options;

	}

}
