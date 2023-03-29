package task3;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    public static void main(String[] args) {

        String gameOfThrones = "Song of ice and fire";
        String author = "George Martin";

        String goals ="Goals";
        String goalsAuthor ="Brian Unknown";

        Book game = new Book(gameOfThrones, author, 100);
        Book goal = new Book(goals, goalsAuthor,200);
        Book book = new Book("Musta pori näkku","Mihkel Raud",50);

//        List<Book> catalogue = new ArrayList<>();
//        catalogue.addAll(game,goal);
        BookCatalogue kataloog = new BookCatalogue();
        kataloog.addBookToCatalogue(game,goal,book);

        //kataloog.removeBook(book);

        System.out.println(kataloog.searchBookByTitle("Musta pori näkku"));
        System.out.println(kataloog.totalPrice());



    }
}
