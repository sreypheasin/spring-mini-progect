package co.istad.miniproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    // POJO class
    private String uuid;
    private String avatar;
    private String author;
}
