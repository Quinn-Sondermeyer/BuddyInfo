public class BuddyInfo {


    private String Name;
    private String Phone;
    private String Adress;

    public BuddyInfo(String name, String phone, String adress) {
        Name = name;
        Phone = phone;
        Adress = adress;
    }

    /**
     * Gets a Buddy's Name
     * return String Name
     */
    public String getName() {
        return Name;
    }
    /**
     * Gets a Buddy's Phone number
     * return String Phone
     */
    public String getPhone() {
        return Phone;
    }
    /**
     * Gets a Buddy's Adress
     * return String Adress
     */
    public String getAdress() {
        return Adress;
    }


    public static void main(String[] args) {
        BuddyInfo Temp =  new BuddyInfo("Homer", "420-420-6969", "420 Blaze St.");
        System.out.println("Hello " + Temp.getName());

    }


}
