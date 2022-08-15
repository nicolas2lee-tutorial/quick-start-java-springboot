package nicolas2lee.tutorial.javaspringbootquickstart.controller;

import nicolas2lee.tutorial.javaspringbootquickstart.domain.Post;
import nicolas2lee.tutorial.javaspringbootquickstart.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/")
    public List<Post> listAll(){
        return postService.getAllPosts();
    }
}
