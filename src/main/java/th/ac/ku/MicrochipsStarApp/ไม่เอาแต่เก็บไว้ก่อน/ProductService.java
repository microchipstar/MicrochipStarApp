//package th.ac.ku.MicrochipsStarApp.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//import th.ac.ku.MicrochipsStarApp.model.MicrochipsStarApp;
//import th.ac.ku.MicrochipsStarApp.model.Product;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    public List<Product> getAlll() {
//        String url = "http://localhost:8091/product";
//        ResponseEntity<Product[]> response =
//                restTemplate.getForEntity(url, Product[].class);
//        Product[] product = response.getBody();
//        return Arrays.asList(product);
//    }
//
//    public void addProduct(Product product) {
//        String url = "http://localhost:8091/product";
//
//        restTemplate.postForObject(url, product, Product.class);
//    }
//}
