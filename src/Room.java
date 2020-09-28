import java.util.ArrayList;

public class Room{
    private String roomColor;
    ArrayList<Book> listOfBooks;
    private int SFBooks =0;
    private int AdventrueBooks = 0;
    private int DramaBooks = 0;

    public Room(String roomColor, ArrayList<Book> listOfBooks) {
        this.roomColor = roomColor;
        this.listOfBooks = listOfBooks;
    }

    public String getRoomColor() {
        return roomColor;
    }

    public void setRoomColor(String roomColor) {
        this.roomColor = roomColor;
    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void getNumberOfBooksByGenre(){
        for(int i =0; i < listOfBooks.size(); i++){
            if(listOfBooks.get(i).getGenre().equals(Book.genre.SF)){
                SFBooks += 1;
            } else if(listOfBooks.get(i).getGenre().equals(Book.genre.ADVENTURE)){
                AdventrueBooks += 1;
            } else if(listOfBooks.get(i).getGenre().equals(Book.genre.DRAMA)){
                DramaBooks += 1;
            } else {
                System.out.println("This books has NO GENRE boi");
            }
        }
        System.out.println("Ther are " + SFBooks + " SF books " + AdventrueBooks + " Adventure books " + DramaBooks + " Drama books.");
    }


    public void findAuthorWithTheMostBooks(){
        ArrayList<String> authors = new ArrayList<>();
        int count = 0, maxCount = 0;
        String authorWithMostBooks = "";
        listOfBooks.forEach(book -> {
            authors.add(book.getAuthor());
        });
        for(int i = 0; i < authors.size(); i++){
            count = 1;
            for(int j = i+1; j < authors.size(); j++){
                if(authors.get(i).equals(authors.get(j))){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                authorWithMostBooks = authors.get(i);
            }
        }

        System.out.println("The author with the most books written in this room is " + authorWithMostBooks);



    }



}
