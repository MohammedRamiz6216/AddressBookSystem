public class Main {
    public static void main(String[] args) {

            Person p1 = new Person();
        System.out.println("Welcome to Address Book");
        Addressbookservice a1 = new Addressbookservice();

        Addressbook b1 = new Addressbook();
        b1.contactList.put(1,p1);
        System.out.println(b1.contactList);
        }

}