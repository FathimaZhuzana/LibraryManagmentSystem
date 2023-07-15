public abstract class LibraryItem {
    protected String title;
    protected String itemID;
    protected boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void checkIn() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println(title + " has been checked in.");
        } else {
            System.out.println(title + " is already checked in.");
        }
    }

    public abstract void displayItemDetails();
}
