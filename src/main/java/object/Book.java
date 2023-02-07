package object;

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
        this.yearPublication = yearPublication;
    }
}
