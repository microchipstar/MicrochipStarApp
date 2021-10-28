package th.ac.ku.MicrochipsStarApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import th.ac.ku.MicrochipsStarApp.model.PO;
import th.ac.ku.MicrochipsStarApp.model.employee;
//import th.ac.ku.MicrochipsStarApp.model.Customer;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class POService {



    @Autowired
    private RestTemplate restTemplate;


    public List<PO> getAll() {
        String url = "http://localhost:8091/PO";
        ResponseEntity<PO[]> response =
                restTemplate.getForEntity(url, PO[].class);
        PO[] carts = response.getBody();
        return Arrays.asList(carts);
    }



    public void addPO(PO cart) {
        String url = "http://localhost:8091/PO";

        restTemplate.postForObject(url, cart, PO.class);
    }
}
