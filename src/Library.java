import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Library {
    Room numberOfRooms;
    ArrayList<Room> listOfRooms;

    public Library(ArrayList<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }

    public Library() {

    }

    public Room getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Room numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public ArrayList<Room> getListOfRooms() {
        return listOfRooms;
    }

    public int getRedRooms(){
        int numberOfRedRooms = 0;
        for(int i = 0; i < listOfRooms.size(); i ++){
            if(listOfRooms.get(i).getRoomColor().equals("red")){
                numberOfRedRooms += 1;
            }
        }
        System.out.println("There are " + numberOfRedRooms + " red rooms.");
        return numberOfRedRooms;
    }


    public void searchByAuthor(String author){
        AtomicInteger numberOfBooksByAuthor = new AtomicInteger();
        listOfRooms.forEach(room -> {
            room.getListOfBooks().forEach(book -> {
                if(author.equals(book.getAuthor())){
                    numberOfBooksByAuthor.addAndGet(1);
                }
            });
        });

        System.out.println("There are " + numberOfBooksByAuthor + " books written by " + author);
    }
}
