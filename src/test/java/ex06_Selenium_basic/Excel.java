package ex06_Selenium_basic;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class Excel {

   // Use Apache POI library:
    @Test
    public void Excel()throws Exception{
        FileInputStream file = new FileInputStream("D:\\TestData.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Login");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println("print to sheet value: "+cell.getStringCellValue());

    }
}
