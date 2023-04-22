package co.istad.miniproject.repository;

import co.istad.miniproject.model.Movie;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Data
public class MovieRepository {
    private  List<Movie> movies;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    @PostConstruct
    void init(){
        movies = new ArrayList<>(){{
            add(new Movie(UUID.randomUUID().toString(),"Movie 1","this is movies one","post01.jpeg",
                    categoryRepository.getCategoryList(),userRepository.getUsersList().get(0)
                    ));
            add(new Movie(UUID.randomUUID().toString(),"Movie 2","this is movies two","post02.jpeg",
                    categoryRepository.getCategoryList(),userRepository.getUsersList().get(1)
            ));
            add(new Movie(UUID.randomUUID().toString(),"Movie 3","this is movies tree","post03.jpeg",
                    categoryRepository.getCategoryList(),userRepository.getUsersList().get(2)
            ));add(new Movie(UUID.randomUUID().toString(),"Movie 4","this is movies four","post04.jpeg",
                    categoryRepository.getCategoryList(),userRepository.getUsersList().get(3)
            ));
        }};
    }
}
