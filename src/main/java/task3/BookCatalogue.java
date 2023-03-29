package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookCatalogue {
    private List<Book> catalogue;

    public BookCatalogue() {
        catalogue = new ArrayList<>();
    }

    public void addBookToCatalogue(Book...books) {
        //catalogue.add(book);
        this.catalogue.addAll(Arrays.asList(books));
    }

    public void removeBook(Book book){
        catalogue.remove(book);
    }

    public List<Book> searchBookByAuthor(String author){
        return catalogue
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchBookByTitle(String title) {
        return catalogue
                .stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    public double totalPrice(){
        return catalogue
                .stream()
                .mapToDouble(book -> book.getPrice())
                .sum();
    }
}
