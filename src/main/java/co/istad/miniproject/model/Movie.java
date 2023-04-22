package co.istad.miniproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie{
    private String uuid;
    private String title;
    private String description;
    private String thumbnail;
    private List<Category> categoryList;
    private Users users;

}
