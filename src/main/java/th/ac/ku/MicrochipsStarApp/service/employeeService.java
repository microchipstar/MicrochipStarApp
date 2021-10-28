package th.ac.ku.MicrochipsStarApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import th.ac.ku.MicrochipsStarApp.model.PO;
import th.ac.ku.MicrochipsStarApp.model.employee;

import java.util.Arrays;
import java.util.List;

@Service
public class employeeService {


    @Autowired
    private RestTemplate restTemplate;



    public List<employee> getE() {
        String url = "http://localhost:8091/employee";
        ResponseEntity<employee[]> response =
                restTemplate.getForEntity(url, employee[].class);
        employee[] carts = response.getBody();
        return Arrays.asList(carts);
    }



    public void addE(employee employee) {
        String url = "http://localhost:8091/employee";

        restTemplate.postForObject(url, employee, employee.class);
    }
}
