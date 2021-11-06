package Condos.services;

import Condos.models.PO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

//import th.ac.ku.MicrochipsStarApp.model.Customer;

@Service
public class POService {



    @Autowired
    private RestTemplate restTemplate;

    public POService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

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
