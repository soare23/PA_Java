import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> listOfRooms = new ArrayList<Room>();
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        Room redRoom = new Room("red", listOfBooks);
        Room blueRoom = new Room("blue", listOfBooks);
        Room redRoom2 = new Room("red", listOfBooks);
        Room redRoom3 = new Room("red", listOfBooks);
        listOfRooms.add(redRoom);
        listOfRooms.add(blueRoom);
        listOfRooms.add(redRoom2);
        listOfRooms.add(redRoom3);

        Library veryBigLibrary = new Library(listOfRooms);
        veryBigLibrary.getRedRooms();

        Book SFbook = new Book(Book.genre.SF, "Soare");
        Book AdventureBook = new Book(Book.genre.ADVENTURE, "Soare");
        Book Drama = new Book(Book.genre.DRAMA, "un autor mult mai slab decat Soare");
        Book SFbook2 = new Book(Book.genre.SF, "Soare");
        listOfBooks.add(SFbook);
        listOfBooks.add(AdventureBook);
        listOfBooks.add(Drama);
        listOfBooks.add(SFbook2);
        redRoom.getNumberOfBooksByGenre();
        redRoom.findAuthorWithTheMostBooks();
        veryBigLibrary.searchByAuthor("un autor mult mai slab decat Soare");


    }
}
