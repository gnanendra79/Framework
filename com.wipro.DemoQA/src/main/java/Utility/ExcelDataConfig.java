package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	
	XSSFWorkbook wb;
	Sheet sh;
	
	public ExcelDataConfig(String excelpath)
	{
		try {
			File src=new File(excelpath);
			
			FileInputStream fis =new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	public String getData(int sheet_no,int row,int column)
	{
		sh=wb.getSheetAt(sheet_no);
		String data=sh.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheet_index)
	{
		int row=wb.getSheetAt(sheet_index).getLastRowNum();
		
		row=row+1;
		
		return row;
	}
}
