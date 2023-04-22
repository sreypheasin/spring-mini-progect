package co.istad.miniproject.repository;

import co.istad.miniproject.model.Movie;
import co.istad.miniproject.model.Users;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Getter
public class StaticRepository {
    private Faker faker;

    @Autowired
    public void setFaker(Faker faker) {
        this.faker = faker;
    }

    private List<Movie> movies;
    private List<Users> users;

    @PostConstruct
    void init() {
        // user card
//        users = new ArrayList<>() {{
//            for (int i = 1; i < 2; i++) {
//                add(new Users(UUID.randomUUID(), "/resources/images/defaults/profiles/profile01.jpeg", faker.book().author(), faker.book().title()));
//                add(new Users(UUID.randomUUID(), "/resources/images/defaults/profiles/profile02.jpeg", faker.book().author(), faker.book().title()));
//                add(new Users(UUID.randomUUID(), "/resources/images/defaults/profiles/profile03.jpeg", faker.book().author(), faker.book().title()));
//                add(new Users(UUID.randomUUID(), "/resources/images/defaults/profiles/profile04.jpeg", faker.book().author(), faker.book().title()));
//            }
//        }};



//        movies = new ArrayList<>() {
//            {
//                for (int i = 0; i <4; i++) {
//                    add(new Movie(users,faker.book().publisher(), "post01.jpeg"));
//                    add(new Movie(users,faker.book().publisher(), "post02.jpeg"));
//                    add(new Movie(users,faker.book().publisher(), "post03.jpeg"));
//                    add(new Movie(users,faker.book().publisher(), "post04.jpeg"));
//                }
//            }
//        };
    }
}

