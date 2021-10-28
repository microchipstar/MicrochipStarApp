//package th.ac.ku.MicrochipsStarApp.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import th.ac.ku.MicrochipsStarApp.model.PO;
//import th.ac.ku.MicrochipsStarApp.service.POService;
//
//
//@Controller
//@RequestMapping("/POTable")
//public class ProductController {
//    @Autowired
//    private POService service;
//
//
//    @GetMapping
//    public String getData(Model model) {
//        model.addAttribute("PO", service.getAll());
//        return "/Product/POTable";
//    }
//
//
//
////    @GetMapping("/add")
////    public String getAddPage() {
////        return "PO";
////    }
////
////    @PostMapping("/add")
////    public String addPO(@ModelAttribute PO po, Model model) {
////        service.addPO(po);
////        return "redirect:/cart";
////    }
//}
