package co.istad.miniproject.services.impl;

import co.istad.miniproject.model.Users;
import co.istad.miniproject.repository.StaticRepository;
import co.istad.miniproject.repository.UserRepository;
import co.istad.miniproject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<Users> useInfo() {
        return userRepository.getUsersList();
    }
}
