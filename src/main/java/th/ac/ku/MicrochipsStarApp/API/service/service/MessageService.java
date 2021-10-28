package th.ac.ku.MicrochipsStarApp.API.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.MicrochipsStarApp.API.service.model.Message;
import th.ac.ku.MicrochipsStarApp.API.service.model.employee;
import th.ac.ku.MicrochipsStarApp.API.service.repository.MessageRepository;
import th.ac.ku.MicrochipsStarApp.API.service.repository.employeeRepository;

import java.util.List;
import java.util.UUID;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public List<Message> getAllM() {
        return repository.findAll();
    }

    public Message createM(Message message) {
        repository.save(message);
        return message;
    }

    public Message getM(long id) {
        return repository.findById(id).get();
    }

    public Message updateM(long id, Message requestBody) {
        Message record = repository.findById(id).get();
        if (requestBody.getUser() != null)
            record.setUser(requestBody.getUser());

        if (requestBody.getText() != null)
            record.setText(requestBody.getText());

        Message r = repository.save(record);

        return r;
    }

    public Message deleteM(long id) {
        Message record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
