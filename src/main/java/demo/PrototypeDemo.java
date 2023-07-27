package demo;

import patterns.creational.prototype.Book;
import patterns.creational.prototype.EItemType;
import patterns.creational.prototype.Movie;
import patterns.creational.prototype.Registry;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Book book = (Book) registry.getInstance(EItemType.Book);
        book.setNumberOfPages(500);

        System.out.println(book);
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getUrl());

        System.out.println();

        Movie movie = (Movie) registry.getInstance(EItemType.Movie);
        movie.setTitle("Batman");
        movie.setRuntime(4);

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getRuntime());
        System.out.println(movie.getUrl());
    }
}
