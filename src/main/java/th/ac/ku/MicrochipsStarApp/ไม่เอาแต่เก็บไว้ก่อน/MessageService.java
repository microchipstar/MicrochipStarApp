package th.ac.ku.MicrochipsStarApp.ไม่เอาแต่เก็บไว้ก่อน;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import th.ac.ku.MicrochipsStarApp.ไม่เอาแต่เก็บไว้ก่อน.Message;

import java.util.Arrays;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private RestTemplate restTemplate;



    public List<Message> getM() {
        String url = "http://localhost:8091/message";
        ResponseEntity<Message[]> response =
                restTemplate.getForEntity(url, Message[].class);
        Message[] carts = response.getBody();
        return Arrays.asList(carts);
    }



    public void addM(Message message) {
        String url = "http://localhost:8091/message";

        restTemplate.postForObject(url, message, Message.class);
    }
}
