package Condos.services;

import Condos.Config.ComponentConfig;
import Condos.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EmployeeService {
    private APIService apiService;
    private Employee employee;
    @Autowired
    private RestTemplate restTemplate = new RestTemplate();

    public EmployeeService() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        apiService = context.getBean(APIService.class);
        employee = new Employee();
    }

    public List<Employee> getE() {
        String url = "http://localhost:8091/employee";
        ResponseEntity<Employee[]> response =
                restTemplate.getForEntity(url, Employee[].class);
        Employee[] carts = response.getBody();

        return Arrays.asList(carts);
    }



    public boolean check(String username,String password) {
        String url = "http://localhost:8091/employee";
        ResponseEntity<Employee[]> response =
                restTemplate.getForEntity(url, Employee[].class);
        Employee[] carts = response.getBody();
        if (employee.getUsernameM().equals(username) && employee.getPasswordM().equals(password)){
            return true;
        }
        for (Employee e: carts) {
            if ((e.getUsernameM().equals(username) && e.getPasswordM().equals(password))){
                return true;
            }
        }
        return false;
    }

    public boolean checkUsername(String username){
        if (employee.getUsernameM().equals(username)){
            return false;
        }
        for (Employee e : apiService.getE()){
            if (username.equals(e.getUsernameM())){
                return false;
            }
        }
        return true;
    }


}
