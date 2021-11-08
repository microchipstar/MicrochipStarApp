package Condos.models;

import Condos.services.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee employee;
    @BeforeEach
    void setEmployee(){
        employee = new Employee();
        employee.setUsernameM("admin");
        employee.setPasswordM("12345");
    }
    @Test
    void check_login_employee_wrong(){
        boolean employeeTest = employee.check("meuang","11111");
        assertEquals(employeeTest,false);
    }

    @Test
    void check_login_employee_correct(){
        boolean employeeTest = employee.check("admin","12345");
        assertEquals(employeeTest,true);
    }

    @Test
    void add_Employee_wrong(){
        boolean employeeTest = employee.checkUsername("admin");
        assertEquals(employeeTest,false);
    }

    @Test
    void add_Employee_correct(){
        boolean employeeTest = employee.checkUsername("admin1");
        assertEquals(employeeTest,true);
    }

}