package com.kodilla.good.patterns.challenges.movie_store;

import java.util.stream.Collectors;

public class MovieStoreApp {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
         String chain = movieStore.getMovies().entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(chain);
    }
}