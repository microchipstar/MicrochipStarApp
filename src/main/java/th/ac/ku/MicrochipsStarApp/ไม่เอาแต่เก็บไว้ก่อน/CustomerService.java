//package th.ac.ku.MicrochipsStarApp.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//import th.ac.ku.MicrochipsStarApp.model.Customer;
//import th.ac.ku.MicrochipsStarApp.model.MicrochipsStarApp;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class CustomerService {
//    @Autowired
//    private RestTemplate restTemplate;
//
//    public List<Customer> getAll() {
//        String url = "http://localhost:8091/registerCustomer";
//        ResponseEntity<Customer[]> response =
//                restTemplate.getForEntity(url, Customer[].class);
//        Customer[] restaurants = response.getBody();
//        return Arrays.asList(restaurants);
//    }
//
//    public void addRestaurant(Customer customer) {
//        String url = "http://localhost:8091/registerCustomer";
//
//        restTemplate.postForObject(url, customer, Customer.class);
//    }
//}
