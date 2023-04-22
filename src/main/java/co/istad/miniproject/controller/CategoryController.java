package co.istad.miniproject.controller;

import co.istad.miniproject.model.Category;
import co.istad.miniproject.model.Movie;
import co.istad.miniproject.services.CategoryService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    public List<Category> allCategory (){
        return categoryService.categoryList();
    }
}
