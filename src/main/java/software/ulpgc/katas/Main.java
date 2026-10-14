package software.ulpgc.katas;

import software.ulpgc.katas.io.EmployeeReader;
import software.ulpgc.katas.io.FileEmployeeReader;
import software.ulpgc.katas.io.UrlEmployeeReader;
import software.ulpgc.katas.model.Employee;

import java.io.File;
import java.net.URL;
import java.util.List;

public class Main {
    static void main() throws Exception{
        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt");
        File file = new File("employees.tsv");
        EmployeeReader reader = new FileEmployeeReader(file);
        List<Employee> employees = reader.readAll();
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
