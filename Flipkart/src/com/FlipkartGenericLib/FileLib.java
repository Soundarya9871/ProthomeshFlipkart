package com.FlipkartGenericLib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Guruprasad N
 *
 */
public class FileLib {
	/**
	 * This method is used to access the data from properties file
	 * 
	 * @param value
	 * @return String
	 */
	public String getPropertyKeyValue(String key) {
		FileInputStream ip = null;
		Properties prop = null;
		try {
			ip = new FileInputStream("./Data/common.properties");
			prop = new Properties();
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prop.getProperty(key);
	}

	/**
	 * This method is used to access the data from Excel
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return String
	 */
	public String getExcelData(String sheetName, int rowNum, int cellNum) {
		FileInputStream ip = null;
		Workbook wb = null;
		try {
			ip = new FileInputStream("C:\\Users\\Guruprasad N\\eclipse-workspace\\selenium\\Myntra\\Data\\testdata.xlsx");
			wb = WorkbookFactory.create(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Sheet sh = wb.getSheet(sheetName);
		Cell c = sh.getRow(rowNum).getCell(cellNum);
		CellType cType = c.getCellType();

		if (cType.toString().equals("NUMERIC")) {
			int data = (int) c.getNumericCellValue();
			return String.valueOf(data);
		} else {
			String data = c.getStringCellValue();
			return data;
		}

	}

}
