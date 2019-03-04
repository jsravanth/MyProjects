package helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
	public static String readData(String SheetName,int rownum,int cellnum)
	{
		try{
		FileInputStream fis= new FileInputStream(".//src//resources//testdata//Erecsion.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		String data=w1.getSheet(SheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;

		}
		catch (Exception rv) {
			System.out.println("Exception occured");
			return "";
		}
			}
	public static void writeData(String SheetName,int rownum,int cellnum,String data)
	{
		try{
		FileInputStream fis= new FileInputStream(".//src//resources//testdata//Erecsion.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		w1.getSheet(SheetName).getRow(rownum).createCell(cellnum).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(".//src//resources//testdata//Erecsion.xlsx");
		w1.write(fos);
		}
		catch (Exception rv) {
			System.out.println("Exception occured");
		}
	}

}
