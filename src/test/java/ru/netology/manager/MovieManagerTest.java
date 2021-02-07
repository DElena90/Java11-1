package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    @Test
    public void testGetLastMoviesWhenAmountMoviesLessDefault() {
        MovieManager manager = new MovieManager();
        Movie movie1 = new Movie(1, "Movie 1", "imgUrl1", "Type 1");
        Movie movie2 = new Movie(2, "Movie 2", "imgUrl2", "Type 2");
        manager.add(movie1);
        manager.add(movie2);
        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLastMoviesWhenAmountMoviesEqualsDefault() {
        MovieManager manager = new MovieManager();
        Movie movie1 = new Movie(1, "Movie 1", "imgUrl1", "Type 1");
        Movie movie2 = new Movie(2, "Movie 2", "imgUrl2", "Type 2");
        Movie movie3 = new Movie(3, "Movie 3", "imgUrl3", "Type 1");
        Movie movie4 = new Movie(4, "Movie 4", "imgUrl4", "Type 2");
        Movie movie5 = new Movie(5, "Movie 5", "imgUrl5", "Type 4");
        Movie movie6 = new Movie(6, "Movie 6", "imgUrl6", "Type 2");
        Movie movie7 = new Movie(7, "Movie 7", "imgUrl7", "Type 5");
        Movie movie8 = new Movie(8, "Movie 8", "imgUrl8", "Type 2");
        Movie movie9 = new Movie(9, "Movie 9", "imgUrl9", "Type 3");
        Movie movie10 = new Movie(10, "Movie 10", "imgUrl10", "Type 1");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLastMoviesWhenAmountMoviesOverDefault() {
        MovieManager manager = new MovieManager();
        Movie movie1 = new Movie(1, "Movie 1", "imgUrl1", "Type 1");
        Movie movie2 = new Movie(2, "Movie 2", "imgUrl2", "Type 2");
        Movie movie3 = new Movie(3, "Movie 3", "imgUrl3", "Type 1");
        Movie movie4 = new Movie(4, "Movie 4", "imgUrl4", "Type 2");
        Movie movie5 = new Movie(5, "Movie 5", "imgUrl5", "Type 4");
        Movie movie6 = new Movie(6, "Movie 6", "imgUrl6", "Type 2");
        Movie movie7 = new Movie(7, "Movie 7", "imgUrl7", "Type 5");
        Movie movie8 = new Movie(8, "Movie 8", "imgUrl8", "Type 2");
        Movie movie9 = new Movie(9, "Movie 9", "imgUrl9", "Type 3");
        Movie movie10 = new Movie(10, "Movie 10", "imgUrl10", "Type 1");
        Movie movie11 = new Movie(11, "Movie 11", "imgUrl11", "Type 6");
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLastMoviesWhenChangedAmountForLastMovies() {
        MovieManager manager = new MovieManager(1);
        Movie movie1 = new Movie(1, "Movie 1", "imgUrl1", "Type 1");
        Movie movie2 = new Movie(2, "Movie 2", "imgUrl2", "Type 2");
        manager.add(movie1);
        manager.add(movie2);
        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{movie2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLastMoviesWhenChangedAmountForLastMoviesAndLessMovies() {
        MovieManager manager = new MovieManager(7);
        Movie movie1 = new Movie(1, "Movie 1", "imgUrl1", "Type 1");
        Movie movie2 = new Movie(2, "Movie 2", "imgUrl2", "Type 2");
        manager.add(movie1);
        manager.add(movie2);
        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{movie2, movie1};
        assertArrayEquals(expected, actual);
    }
}
