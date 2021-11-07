package Condos.services;

import Condos.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EmployeeService {
    private APIService apiService;
    private EmployeeList employeeList;
    @Autowired
    private RestTemplate restTemplate = new RestTemplate();

    public List<Employee> getE() {
        String url = "http://localhost:8091/employee";
        ResponseEntity<Employee[]> response =
                restTemplate.getForEntity(url, Employee[].class);
        Employee[] carts = response.getBody();

        return Arrays.asList(carts);
    }

    public void readData(){
        String url = "http://localhost:8091/employee";
        ResponseEntity<Employee[]> response =
                restTemplate.getForEntity(url, Employee[].class);
        Employee[] carts = response.getBody();
        for (Employee e : carts){
            employeeList.addItem(e);
            System.out.println(e.getUsernameM());
        }
    }

    public EmployeeList getDatazz() {
        employeeList = new EmployeeList();
        readData();
//        try {
//            employeeList = new EmployeeList();
//            readData();
//        } catch (FileNotFoundException e) {
//
//        } catch (IOException e) {
//            System.err.println("IOException from reading " + this.fileName);
//        }
        return employeeList;
    }

    public boolean check(String username,String password) {
        String url = "http://localhost:8091/employee";
        ResponseEntity<Employee[]> response =
                restTemplate.getForEntity(url, Employee[].class);
        Employee[] carts = response.getBody();
        for (Employee e: carts) {
            if (e.getUsernameM().equals(username) && e.getPasswordM().equals(password)){
                return true;
            }
        }
        return false;
    }
}
