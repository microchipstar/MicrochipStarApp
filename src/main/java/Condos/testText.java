package Condos;

import Condos.Config.ComponentConfig;
import Condos.models.Employee;
import Condos.models.POModel;
import Condos.services.APIService;
import Condos.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.AsyncRestOperations;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class testText {
    private static APIService service;
    private static EmployeeService employeeService;
    private static Employee employee;
    private static RestTemplate restTemplate;


    public static void main(String[] args) {
//        restTemplate = new RestTemplate();
        employeeService = new EmployeeService();
//        System.out.println(employeeService.getE().get(0).getUsernameM());
        if (employeeService.check("admin","12345")){
            System.out.println("มี");
        }else {
            System.out.println("ไม่มี");
        }
//        employeeService = new EmployeeService();
//        employee = new Employee();
//        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
//        service = context.getBean(APIService.class);
//        for (int i = 0; i < service.getE().size() ;i++){
//            System.out.println(service.getE().get(i).getIdM());
//        }
//        System.out.println(service.getE().get(0).getIdM());
//        String url = "http://localhost:8091/PO";
//        ResponseEntity<POModel[]> response =
//                restTemplate.getForEntity(url, POModel[].class);
//        POModel[] carts = response.getBody();
//        for (int i = 0; i < carts.length;i++){
//            System.out.println(i);
//        }
//        for (POModel c: carts) {
//            System.out.println(c.getEmail_PO());
//        }
//
//        String responseEntity = restTemplate.getForObject(url,String.class);
//
//            System.out.println(responseEntity);


//        if (employeeService.check("admin","12345")){
//            System.out.println("มี");
//        }else {
//            System.out.println("ไม่มี");
//        }

//        System.out.println(service.getAll().get(0).getAddress_PO());
//        System.out.println(service.getE().get(0).getUsernameM());
//        System.out.println(employeeService.check("admin","12345"));
//        if (employeeService.check("admin","12345")){
//            System.out.println("มี");
//        }else {
//            System.out.println("ไม่มี");
//        }
    }
}
