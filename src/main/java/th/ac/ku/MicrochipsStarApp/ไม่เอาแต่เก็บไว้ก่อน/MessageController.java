package th.ac.ku.MicrochipsStarApp.ไม่เอาแต่เก็บไว้ก่อน;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MessageController {

    private MessageService repository;

    public MessageController(MessageService repository) {
        this.repository = repository;
    }

    @GetMapping("/message")
    public String getMessagePage(Model model) {
        model.addAttribute("messages", repository.getM());
        return "/employee/message";
    }

    @GetMapping("/post")
    public String getPostPage() {
        return "/employee/post";
    }

    @PostMapping("/message")
    public String postMessage(@ModelAttribute Message message, Model model) {
        repository.addM(message);
        model.addAttribute("messages", repository.getM());
        return "redirect:message";
    }


}
