package buoi11_giaibaitap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    static String fileLocation;
    static FileInputStream file;
    static Workbook workbook;

    public static void main(String[] args) {
        try {
            fileLocation = "G:\\Personal\\IMIC\\IMIC\\Java_Core\\C11_Java\\Java_Practice\\src\\main\\java\\buoi11_giaibaitap\\data.xlsx";
            file = new FileInputStream(new File(fileLocation));
            workbook = new XSSFWorkbook(file);



        }
        catch (Exception e) {
        }
        readExcelFile();
    }

    public static void readExcelFile() {

        try {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.println(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.println(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            System.out.println(cell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            System.out.println(cell.getCellFormula());
                            break;
                        default:
                            System.out.print("others");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writeExcelFile(){
        try {
            Sheet sheet = workbook.getSheetAt(0);


            FileOutputStream outputStream = new FileOutputStream(fileLocation);
            workbook.write(outputStream);
            workbook.close();
        }catch (Exception e){}
    }

}
