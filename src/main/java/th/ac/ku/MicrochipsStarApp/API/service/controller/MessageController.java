package th.ac.ku.MicrochipsStarApp.API.service.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.MicrochipsStarApp.API.service.model.Message;
import th.ac.ku.MicrochipsStarApp.API.service.model.employee;
import th.ac.ku.MicrochipsStarApp.API.service.repository.MessageRepository;
import th.ac.ku.MicrochipsStarApp.API.service.service.MessageService;
import th.ac.ku.MicrochipsStarApp.API.service.service.employeeService;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService service;

    @GetMapping
    public List<Message> getAll() {
        return service.getAllM();
    }

    @PostMapping
    public Message create(@RequestBody Message message) {
        return service.createM(message);
    }

    @GetMapping("/{id}")
    public Message getCart(@PathVariable long id) {
        return service.getM(id);
    }

    @PutMapping("/{id}")
    public Message update(@PathVariable long id, @RequestBody Message message) {
        return service.updateM(id, message);
    }

    @DeleteMapping("/{id}")
    public Message delete(@PathVariable long id) {
        return service.deleteM(id);
    }


}
