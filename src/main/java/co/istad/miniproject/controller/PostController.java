package co.istad.miniproject.controller;

import co.istad.miniproject.model.Category;
import co.istad.miniproject.model.Movie;
import co.istad.miniproject.services.CategoryService;
import co.istad.miniproject.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {
    private final MovieService movieService;
    public List<Movie> allMovies (){
        return movieService.findAll();
    }

    @GetMapping("/new")
    String newPost(){
        return "/pages/posts/new";
    }


}
