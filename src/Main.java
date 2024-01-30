public class Main {
    public static void main(String[] args) {

            Person p1 = new Person();
        System.out.println("Welcome to Address Book");
        Addressbookservice a1 = new Addressbookservice();
        a1.setval(p1);
        System.out.println(a1.display(p1));
        Addressbook b1 = new Addressbook();
        b1.contactList.put(1,p1);
        a1.UpdateContact(p1);
        System.out.println(b1.contactList);
        }

}