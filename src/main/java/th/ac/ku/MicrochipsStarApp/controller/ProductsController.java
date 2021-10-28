package th.ac.ku.MicrochipsStarApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import th.ac.ku.MicrochipsStarApp.model.Product;
//import th.ac.ku.MicrochipsStarApp.service.CartService;
//import th.ac.ku.MicrochipsStarApp.service.MicrochipsStarAppService;
//import th.ac.ku.MicrochipsStarApp.service.ProductService;

@Controller
@RequestMapping("/Products")
public class ProductsController {


    @GetMapping("/8-bit Microcontrollers")
    public String get8BitMicrocontrollers() {
        return "/Product/8-bit Microcontrollers";
    }


    @GetMapping("/16-bit Microcontrollers")
    public String get16BitMicrocontrollers() {
        return "/Product/16-bit Microcontrollers";
    }

    @GetMapping("/32-bit microcontrollers")
    public String get32BitMicrocontrollers() {
        return "/Product/32-bit microcontrollers";
    }
}
