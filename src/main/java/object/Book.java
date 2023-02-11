package object;

import java.util.Objects;

public class Book {
   private String book;
    private Author author;
    private int yearPublication;

    public Book(String book, Author author, int yearPublication) {
        this.book = book;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getBook() {
        return book;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        if (yearPublication < 1950 || yearPublication > 2050) {
            System.out.println("Invalid publishing year:" + yearPublication);
            return;
        }
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Книга  " + book + ", автор =" + author + ", год издания =" + yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book1 = (Book) o;
        return book.equals(book1.book) && author.equals(book1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, author);
    }
}
