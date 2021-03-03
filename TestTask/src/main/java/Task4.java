import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Task4 {
    public static void main(String[] args){
        try{
            InputStream inputStream = null;
            HSSFWorkbook workbook = null;
            inputStream = new FileInputStream("example.xls");
            workbook = new HSSFWorkbook(inputStream);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
