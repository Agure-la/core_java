package Task10_11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteExcel {

    void writeExcel(){

        // Create a new Excel workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a new sheet
        Sheet sheet = workbook.createSheet("My Sheet");

        // Create some data
        Object[][] data = {
                {"Name", "Age", "Gender"},
                {"John Doe", 30, "Male"},
                {"Jane Smith", 25, "Female"},
                {"Bob Johnson", 45, "Male"}
        };

        // Iterate over the data and write it to the sheet
        int rownum = 0;
        for (Object[] rowdata : data) {
            Row row = sheet.createRow(rownum++);
            int cellnum = 0;
            for (Object obj : rowdata) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String) {
                    cell.setCellValue((String)obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer)obj);
                }
            }
        }

        // Write the workbook to a file
        FileOutputStream fileOut = new FileOutputStream("data.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Close the workbook
        workbook.close();

        System.out.println("Data has been written to the Excel file.");

    }

    void readExcel(){
        String filename = "exe.xlsx";
        String sheetname = "Sheet1";

        try (FileInputStream inputStream = new FileInputStream(new File(filename));
             Workbook workbook = WorkbookFactory.create(inputStream)) {

            Sheet sheet = workbook.getSheet(sheetname);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet " + sheetname + " not found in workbook");
            }

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.getStringCellValue() + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/**
 * create a pom file
 * <dependency>
 *     <groupId>org.apache.poi</groupId>
 *     <artifactId>poi-ooxml</artifactId>
 *     <version>5.1.0</version>
 * </dependency>
 */

}
