import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Person p1 = new Person();
        Addressbookservice a1 = new Addressbookservice();
        Scanner scan = new Scanner(System.in);
        int mulContacts = scan.nextInt();
        for(int i=0;i<mulContacts;i++) {
            a1.setval(p1);
            System.out.println(a1.display(p1));
        }
        Addressbook b1 = new Addressbook();
        b1.contactList.put(1,p1);
        b1.addPerson(1,p1);

        System.out.println("Enter person's first name");
        String deleteFname = scan.next();
        System.out.println("Enter person's last name");
        String deleteLname = scan.next();
        b1.deletePerson(deleteFname, deleteLname);
        a1.UpdateContact(p1);
        System.out.println(b1.contactList);
        }

}