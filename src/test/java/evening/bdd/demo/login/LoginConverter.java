package evening.bdd.demo.login;

import evening.bdd.demo.core.BaseConverter;
import evening.bdd.demo.utility.ExcelUtility;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class LoginConverter extends BaseConverter {

    @Override
    public void updateStatus(boolean status, String sheetName, int rowIndex, int cellIndex) {
        super.updateStatus(status, sheetName, rowIndex, cellIndex);
    }

    public LoginData getLoginData(int rowIndex) {
        ExcelUtility excelUtility = new ExcelUtility();
        Sheet sheet = excelUtility.read("Login");
        Row row = sheet.getRow(3);
        String userId = row.getCell(2).getStringCellValue();
        String password = row.getCell(3).getStringCellValue();
        LoginData loginData = new LoginData(userId, password);
        return loginData;

    }
}
