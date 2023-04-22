package co.istad.miniproject.services.impl;

import co.istad.miniproject.model.Movie;
import co.istad.miniproject.repository.MovieRepository;
import co.istad.miniproject.repository.StaticRepository;
import co.istad.miniproject.services.MovieService;
import co.istad.miniproject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.getMovies();
    }
}
