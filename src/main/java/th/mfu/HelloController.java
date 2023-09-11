package th.mfu;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

     @GetMapping("/hello")
     public String hello(Model model) {
         model.addAttribute("message", "Welcome to Spring MVC!");
         return "greet";
     }
     
}
