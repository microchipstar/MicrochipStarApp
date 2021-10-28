package th.ac.ku.MicrochipsStarApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login_admin")
public class loginController {

    @GetMapping
    public String getLogin() {
        return "/employee/login";
    }
}
