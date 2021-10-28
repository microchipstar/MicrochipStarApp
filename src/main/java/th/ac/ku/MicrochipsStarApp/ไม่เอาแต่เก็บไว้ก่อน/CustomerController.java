//package th.ac.ku.MicrochipsStarApp.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import th.ac.ku.MicrochipsStarApp.model.Customer;
//import th.ac.ku.MicrochipsStarApp.model.MicrochipsStarApp;
//import th.ac.ku.MicrochipsStarApp.service.CustomerService;
//import th.ac.ku.MicrochipsStarApp.service.MicrochipsStarAppService;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//@RequestMapping("/registerCustomer")
//public class CustomerController {
//
//    private List<Customer> CustomerList = new ArrayList<>();
//
//    @Autowired
//    private CustomerService service;
//
//
//    @GetMapping
//    public String getData(Model model) {
//        model.addAttribute("Customer", service.getAll());
//        return "RegisterCustomerTable";
//    }
//
//
//    @GetMapping("/add")
//    public String getAddPage() {
//        return "RegisterCustomer";
//    }
//
//    @PostMapping("/add")
//    public String addRegister(@ModelAttribute Customer customer, Model model) {
//        service.addRestaurant(customer);
//        return "redirect:/registerCustomer";
//    }
//}
