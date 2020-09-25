import java.util.ArrayList;
public class AddressBook {
    ArrayList<BuddyInfo> book;

    public AddressBook() {
        book = new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println("Address Book about buddy info");
        BuddyInfo bud_1 = new BuddyInfo("jet", "420-420-9999", "4 ontario st");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(bud_1);
        addressbook.removeBuddy(bud_1);
    }

    /**
     * Adds a person to the List of Buddys
     */
    public void addBuddy(BuddyInfo bud) {
        book.add(bud);
    }
    /**
     * removes a person to the List of Buddys
     */
    public void removeBuddy(BuddyInfo bud) {
        book.remove(bud);
    }
}
