package co.istad.miniproject.repository;

import co.istad.miniproject.model.Category;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Data
public class CategoryRepository {
    private List<Category> categoryList;

    @PostConstruct
    void init(){
        categoryList = new ArrayList<>(){{
            add(new Category(UUID.randomUUID().toString(),"K-Drama"));
            add(new Category(UUID.randomUUID().toString(),"C-Drama"));
            add(new Category(UUID.randomUUID().toString(),"Anime"));
            add(new Category(UUID.randomUUID().toString(),"Hollywood"));
        }};
    }
}
