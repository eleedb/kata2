package software.ulpgc.katas.io;

import software.ulpgc.katas.model.Employee;

import java.util.List;

public class UrlEmployeeReader implements EmployeeReader {

    private final String url;

    public UrlEmployeeReader(String url){
        this.url = url;
    }

    @Override
    public List<Employee> readAll() {
        return null;
    }
}
