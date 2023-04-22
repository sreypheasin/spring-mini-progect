package co.istad.miniproject.controller;

import co.istad.miniproject.model.Movie;
import co.istad.miniproject.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final PostController postController;
    private final CategoryController categoryController;
    @GetMapping("/")
    String viewHomePage(Model model){
        System.out.println(postController.allMovies());
        model.addAttribute("movies",postController.allMovies());
        model.addAttribute("categories",categoryController.allCategory());
        return "pages/index";
    }
}
