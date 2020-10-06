package morning.bdd.demo;

import evening.bdd.demo.login.LoginData;
import evening.bdd.demo.utility.ExcelUtility;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelRunner {
    public static void main(String[] args) {
        ExcelUtility utility = new ExcelUtility();
//        Sheet sheet = utility.read("Login");
//        Row row = sheet.getRow(2);
//
//        Cell userIdCell = row.getCell(2);
//        String userId = userIdCell.getStringCellValue();
//        Cell passwordCell = row.getCell(3);
//        String password = passwordCell.getStringCellValue();
//
//        System.out.println(userId + " : " + password);
        Workbook workbook = utility.initWrite();

        LoginData loginData = new LoginData("testUser", "passkey12");

        Sheet sheet = workbook.getSheet("Login");
        Row row = sheet.createRow(3);
        Cell userIdCell = row.createCell(2);
        userIdCell.setCellValue(loginData.getUserId());
        Cell passwordCell = row.createCell(3);
        passwordCell.setCellValue(loginData.getPassword());

        utility.write(workbook);
    }
}
