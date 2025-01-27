package encapsulationpolymorphism.librarymanagementsystem;

class Book extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 14; // 14 days
    private boolean isReserved = false;
    private String reservedBy;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            isReserved = true;
            reservedBy = borrower;
            System.out.printf("Book '%s' reserved by %s.\n", getTitle(), borrower);
        } else {
            System.out.printf("Book '%s' is already reserved by %s.\n", getTitle(), reservedBy);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

