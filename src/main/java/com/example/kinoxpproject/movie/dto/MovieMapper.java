package com.example.kinoxpproject.movie.dto;

import com.example.kinoxpproject.movie.model.Movie;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Component;

@Component
public class MovieMapper {



    private final ModelMapper modelMapper;

    public MovieMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    public MovieDto movieToDto(Movie movie){
        return modelMapper.map(movie,MovieDto.class);
    }
    public Movie dtoToMovie(MovieDto movieDto){
        return modelMapper.map(movieDto,Movie.class);
    }



}
