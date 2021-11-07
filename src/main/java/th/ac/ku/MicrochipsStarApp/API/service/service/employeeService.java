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

    public employee getE(int id) {
        return repository.findById(id).get();
    }

    public employee updateE(int id, employee requestBody) {
        employee record = repository.findById(id).get();
        if (requestBody.getUsernameM() != null)
            record.setUsernameM(requestBody.getUsernameM());

        if (requestBody.getPasswordM() != null)
            record.setPasswordM(requestBody.getPasswordM());

        if (requestBody.getNameM() != null)
            record.setNameM(requestBody.getNameM());

        if (requestBody.getID_E() > 0)
            record.setID_E(requestBody.getID_E());
        employee r = repository.save(record);

        return r;
    }

    public employee deleteE(int id) {
        employee record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
