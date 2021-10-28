package th.ac.ku.MicrochipsStarApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.MicrochipsStarApp.model.PO;
import th.ac.ku.MicrochipsStarApp.service.POService;

import java.io.IOException;


@Controller
@RequestMapping("/cart")
public class POController {

    @Autowired
    private POService service;


    @GetMapping
    public String getData(Model model) {
        model.addAttribute("PO", service.getAll());
        return "/Product/POTable";
    }


    @GetMapping("/add")
    public String getAddPage() {
        return "/Product/PO";
    }

    @PostMapping("/add")
    public String addPO(@ModelAttribute PO po, Model model) {
        if (po.getName_PO().isEmpty()){
            return "home";
        }else {
            service.addPO(po);
        }
        return "redirect:/cart";
    }

//    @GetMapping("/add8-bit Microcontrollers")
//    public String getAdd8bit() {
//        return "/Product/8-bit Microcontrollers";
//    }
//
//    @PostMapping("/add8-bit Microcontrollers")
//    public String addCart8bit(@ModelAttribute PO po, Model model) {
//        service.addPO(po);
//        return "redirect:/cart";
//    }
//
//    @GetMapping("/add16-bit Microcontrollers")
//    public String getAdd16bit() {
//        return "/Product/16-bit Microcontrollers";
//    }
//
//    @PostMapping("/add16-bit Microcontrollers")
//    public String addCart16bit(@ModelAttribute PO cart, Model model) {
//        service.addPO(cart);
//        return "redirect:/cart";
//    }
//
//    @GetMapping("/add32-bit Microcontrollers")
//    public String getAdd32bit() {
//        return "/Product/32-bit Microcontrollers";
//    }
//
//    @PostMapping("/add32-bit Microcontrollers")
//    public String addCart32bit(@ModelAttribute PO cart, Model model) {
//        service.addPO(cart);
//        return "redirect:/cart";
//    }
}
