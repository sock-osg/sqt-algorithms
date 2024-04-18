package com.oz.twentyfour.feb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ShortestBooksTest {

  private final ShortestBooks shortestBooks = new ShortestBooks();

  @Test
  void test() {
    var authors = List.of(
        new ShortestBooks.Author("A01", List.of(
            new ShortestBooks.Book("Book A01B01", 187),
            new ShortestBooks.Book("Book A01B02", 4298),
            new ShortestBooks.Book("Book A01B03", 123))),
        new ShortestBooks.Author("A02", List.of(
            new ShortestBooks.Book("Book A02B01", 200),
            new ShortestBooks.Book("Book A02B02", 234),
            new ShortestBooks.Book("Book A02B03", 527),
            new ShortestBooks.Book("Book A02B04", 1050))),
        new ShortestBooks.Author("A03", List.of(
            new ShortestBooks.Book("Book A03B01", 4563),
            new ShortestBooks.Book("Book A03B02", 8459)))
    );

    List<ShortestBooks.Book> books = this.shortestBooks.solve(authors, 200);

    Assertions.assertEquals(3, books.size());
  }
}
