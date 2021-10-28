package th.ac.ku.MicrochipsStarApp.API.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.MicrochipsStarApp.API.service.model.PO;
import th.ac.ku.MicrochipsStarApp.API.service.model.employee;
import th.ac.ku.MicrochipsStarApp.API.service.repository.PORepository;
import th.ac.ku.MicrochipsStarApp.API.service.repository.employeeRepository;

import java.util.List;
import java.util.UUID;

@Service
public class employeeService {

    @Autowired
    private employeeRepository repository;

    public List<employee> getAllE() {
        return repository.findAll();
    }

    public employee createE(employee employee) {
        repository.save(employee);
        return employee;
    }

    public employee getE(UUID id) {
        return repository.findById(id).get();
    }

    public employee updateE(UUID id, employee requestBody) {
        employee record = repository.findById(id).get();
        if (requestBody.getUsername_E() != null)
            record.setUsername_E(requestBody.getUsername_E());

        if (requestBody.getPassword_E() != null)
            record.setPassword_E(requestBody.getPassword_E());

        if (requestBody.getName_E() != null)
            record.setName_E(requestBody.getName_E());

        if (requestBody.getCheckPassword_E() != null)
            record.setCheckPassword_E(requestBody.getCheckPassword_E());

        if (requestBody.getEmail_E() != null)
            record.setEmail_E(requestBody.getEmail_E());

        employee r = repository.save(record);

        return r;
    }

    public employee deleteE(UUID id) {
        employee record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
