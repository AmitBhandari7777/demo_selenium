package evening.bdd.demo.utility;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.*;

public class ExcelUtility {

    private File file = new File("src/test/resources/extra/testData.xlsx");


    public Sheet read(String sheetName) {

        try {

            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheet(sheetName);
            return sheet;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Workbook initWrite() {
        try {
            FileInputStream fis = new FileInputStream(file);
            try {
                Workbook workbook = WorkbookFactory.create(fis);
                return workbook;
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void write(Workbook workbook) {
        try {
            FileOutputStream fos = new FileOutputStream(file);

            workbook.write(fos);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
