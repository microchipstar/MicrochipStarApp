package th.ac.ku.MicrochipsStarApp.API.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.MicrochipsStarApp.API.service.model.PO;
import th.ac.ku.MicrochipsStarApp.API.service.model.employee;
import th.ac.ku.MicrochipsStarApp.API.service.service.POService;
import th.ac.ku.MicrochipsStarApp.API.service.service.employeeService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employee")
public class employeeController {
    @Autowired
    private employeeService service;

    @GetMapping
    public List<employee> getAll() {
        return service.getAllE();
    }

    @PostMapping
    public employee create(@RequestBody employee employee) {
        return service.createE(employee);
    }

    @GetMapping("/{id}")
    public employee getCart(@PathVariable int id) {
        return service.getE(id);
    }

    @PutMapping("/{id}")
    public employee update(@PathVariable int id, @RequestBody employee employee) {
        return service.updateE(id, employee);
    }

    @DeleteMapping("/{id}")
    public employee delete(@PathVariable int id) {
        return service.deleteE(id);
    }
}
