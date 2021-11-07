package Condos.services;

import Condos.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private ArrayList<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }


    public void addItem(Employee letter){
        this.employees.add(0,letter);
    }

    public ArrayList<Employee> toList() {
        return employees;
    }


}
