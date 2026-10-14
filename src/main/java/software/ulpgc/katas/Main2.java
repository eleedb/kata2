package software.ulpgc.katas;

import software.ulpgc.katas.io.EmployeeReader;
import software.ulpgc.katas.io.FileEmployeeReader;
import software.ulpgc.katas.model.Employee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;

public class Main2 {
    static void main() throws Exception{
        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt");
        File file = new File("employees4.tsv");
        try(InputStream is=url.openStream(); OutputStream os = new FileOutputStream(file)){
            os.write(is.readAllBytes());
        }
    }
}
