package evening.bdd.demo.core;

import evening.bdd.demo.utility.ExcelUtility;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class BaseConverter {

    public void updateStatus(boolean status, String sheetName, int rowIndex, int cellIndex) {
        ExcelUtility excelUtility = new ExcelUtility();
        Workbook workbook = excelUtility.initWrite();

        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowIndex);
        if (status) {
            row.getCell(cellIndex).setCellValue("OK");
        }else{
            row.getCell(cellIndex).setCellValue("FAIL");
        }

        excelUtility.write(workbook);
    }
}
