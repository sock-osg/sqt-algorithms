package com.oz.twentyfour.feb;

import java.util.List;

public class ShortestBooks {

  public record Author(String name, List<Book> books) {}

  public record Book(String name, int pages) {}

  public List<Book> solve(final List<Author> authors, final int pages) {
    return authors.parallelStream().flatMap(author -> author.books.stream()).filter(book -> book.pages <= pages).toList();
  }
}
