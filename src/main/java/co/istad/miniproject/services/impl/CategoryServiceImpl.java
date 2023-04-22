package co.istad.miniproject.services.impl;

import co.istad.miniproject.model.Category;
import co.istad.miniproject.repository.CategoryRepository;
import co.istad.miniproject.repository.StaticRepository;
import co.istad.miniproject.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> categoryList() {
        return categoryRepository.getCategoryList();
    }
}
