package encapsulationpolymorphism.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    public static void manageLibraryItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.printf("Loan Duration: %d days\n", item.getLoanDuration());

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.printf("Availability: %s\n", reservable.checkAvailability() ? "Available" : "Not Available");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        libraryItems.add(new Magazine("M001", "National Geographic", "Various"));
        libraryItems.add(new DVD("D001", "Inception", "Christopher Nolan"));

        manageLibraryItems(libraryItems);

        // Demonstrate reserving items
        Book book = (Book) libraryItems.get(0);
        book.reserveItem("Alice");
        book.reserveItem("Bob");

        DVD dvd = (DVD) libraryItems.get(2);
        dvd.reserveItem("Charlie");
        dvd.reserveItem("Dave");
    }

}

