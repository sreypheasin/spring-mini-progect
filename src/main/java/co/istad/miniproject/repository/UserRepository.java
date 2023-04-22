package co.istad.miniproject.repository;

import co.istad.miniproject.model.Users;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Data
public class UserRepository {
    private List<Users> usersList;
    @PostConstruct
    void init (){
        usersList = new ArrayList<>(){{
            add(new Users(UUID.randomUUID().toString(),"profile01.jpeg","Odinn"));
            add(new Users(UUID.randomUUID().toString(),"profile02.jpeg","Phea"));
            add(new Users(UUID.randomUUID().toString(),"profile03.jpeg","Chento"));
            add(new Users(UUID.randomUUID().toString(),"profile04.jpeg","Rithy"));
        }};
    }
}
