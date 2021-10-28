//package th.ac.ku.MicrochipsStarApp.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//import th.ac.ku.MicrochipsStarApp.model.MicrochipsStarApp;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class MicrochipsStarAppService {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    public List<MicrochipsStarApp> getAll() {
//        String url = "http://localhost:8091/register";
//        ResponseEntity<MicrochipsStarApp[]> response =
//                restTemplate.getForEntity(url, MicrochipsStarApp[].class);
//        MicrochipsStarApp[] restaurants = response.getBody();
//        return Arrays.asList(restaurants);
//    }
//
//    public void addRestaurant(MicrochipsStarApp restaurant) {
//        String url = "http://localhost:8091/register";
//
//        restTemplate.postForObject(url, restaurant, MicrochipsStarApp.class);
//    }
//
//}
