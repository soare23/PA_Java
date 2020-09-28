public class Book {
    private String author;
    private Book.genre genre;

    enum genre{
        SF,
        DRAMA,
        ADVENTURE,
    }

    public Book(Book.genre genre, String author) {
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book.genre getGenre() {
        return genre;
    }

}
