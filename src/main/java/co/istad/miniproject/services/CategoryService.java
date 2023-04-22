package co.istad.miniproject.services;

import co.istad.miniproject.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    List<Category> categoryList();
}
