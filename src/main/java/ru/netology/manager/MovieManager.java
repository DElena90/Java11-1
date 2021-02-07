package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
  private Movie[] movies = new Movie[0];
  private final int amountLastMovies;

  public MovieManager() {
    this.amountLastMovies = 10;
  }

  public MovieManager(int amountLastMovies) {
    this.amountLastMovies = amountLastMovies;
  }

  public void add(Movie item) {
    // создаём новый массив размером на единицу больше
    int length = movies.length + 1;
    Movie[] tmp = new Movie[length];
    // itar + tab
    // копируем поэлементно
    // for (int i = 0; i < items.length; i++) {
    //   tmp[i] = items[i];
    // }
    System.arraycopy(movies, 0, tmp, 0, movies.length);
    // кладём последним наш элемент
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    movies = tmp;
  }

  public Movie[] getLastMovies() {
    // перебираем массив в прямом порядке
    // но кладём в результаты в обратном
    int amount = Math.min(movies.length, amountLastMovies);
    Movie[] result = new Movie[amount];
    for (int i = 0; i < amount; i++) {
      int index = movies.length - i - 1;
      result[i] = movies[index];
    }
    return result;
  }
}
