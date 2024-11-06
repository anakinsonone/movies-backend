package dev.akhilesh.movies.service;

import dev.akhilesh.movies.entity.Movie;
import dev.akhilesh.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }
    
    public Optional<Movie> findMovieById(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
