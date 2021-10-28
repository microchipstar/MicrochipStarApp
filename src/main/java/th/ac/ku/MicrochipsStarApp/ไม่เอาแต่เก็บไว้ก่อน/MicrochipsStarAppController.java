//package th.ac.ku.MicrochipsStarApp.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import th.ac.ku.MicrochipsStarApp.model.MicrochipsStarApp;
//import th.ac.ku.MicrochipsStarApp.service.MicrochipsStarAppService;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//@RequestMapping("/register")
//public class MicrochipsStarAppController {
//
//    private List<MicrochipsStarApp> microchipsStarAppList = new ArrayList<>();
//
//    @Autowired
//    private MicrochipsStarAppService service;
//
//
//    @GetMapping
//    public String getData(Model model) {
//        model.addAttribute("RegisterTable", service.getAll());
//        return "RegisterTable";
//    }
//
//
//    @GetMapping("/add")
//    public String getAddPage() {
//        return "MicrochipsStarAppadd";
//    }
//
//    @PostMapping("/add")
//    public String addRegister(@ModelAttribute MicrochipsStarApp microchipsStarApp, Model model) {
//        service.addRestaurant(microchipsStarApp);
//        return "redirect:/register";
//    }
//
//
//}
