package ex04_Selenium_basic;

import org.testng.annotations.Test;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;

public class TestSelenium09 {

    // Utility method to read Excel and return 2D Object array
    public Object[][] readExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        // ✅ Defensive check
        if (sheet == null) {
            throw new RuntimeException("❌ Sheet '" + sheetName + "' not found in file: " + filePath);
        }

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows - 1][cols]; // skip header row

        for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = (cell == null) ? "" : cell.toString();
            }
        }
        workbook.close();
        fis.close();
        return data;
    }

    // DataProvider to supply data to TestNG test
    @DataProvider(name = "LoginData")
    public Object[][] getData() throws IOException {
        String filePath = "D:\\TestData.xlsx";
        return readExcelData(filePath, "Login");
    }

    // Test method using data from Excel
    @Test(dataProvider = "LoginData")
    public void loginTest(String username, String password) {
        System.out.println("Testing login with Username: " + username + " | Password: " + password);
        // Add your Selenium login steps here
    }
}