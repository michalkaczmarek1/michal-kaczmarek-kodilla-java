package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();

        String joinStringTitleMovies = movies.entrySet().stream()
                .map(k -> k.getKey())
                .flatMap(k -> movies.get(k).stream())
                .collect(Collectors.joining("!", "!", "!"));

        System.out.println(joinStringTitleMovies);
    }
}
