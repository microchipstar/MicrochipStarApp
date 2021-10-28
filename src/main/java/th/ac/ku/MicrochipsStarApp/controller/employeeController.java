package th.ac.ku.MicrochipsStarApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.MicrochipsStarApp.model.PO;
import th.ac.ku.MicrochipsStarApp.model.employee;
import th.ac.ku.MicrochipsStarApp.service.POService;
import th.ac.ku.MicrochipsStarApp.service.employeeService;

@Controller
@RequestMapping("/employee")
public class employeeController {
    @Autowired
    private employeeService service;

    @GetMapping
    public String getData(Model model) {
        model.addAttribute("employee", service.getE());
        return "/employee/employeeTable";
    }

    @GetMapping("/add")
    public String getAddPageE() {
        return "/employee/register";
    }

    @PostMapping("/add")
    public String addE(@ModelAttribute employee employee, Model model) {
        service.addE(employee);
        return "redirect:/employee";
    }


}
