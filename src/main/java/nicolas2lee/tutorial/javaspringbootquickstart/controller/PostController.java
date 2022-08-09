package nicolas2lee.tutorial.javaspringbootquickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
