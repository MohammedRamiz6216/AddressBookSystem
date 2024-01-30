
import java.util.Scanner;
public class Addressbookservice {
    public String display(Person p){
        return p.getFirstName()+ " "+p.getLastName()+" "+p.getCity()+" "+p.getState()+" "+p.getEmail()+" "+p.getPhoneNumber()+" "+p.getZip();
    }
    public void setval(Person p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstn =sc.next();
        p.setFirstName(firstn);
        System.out.println("Enter your last name");
        String lastn =sc.next();
        p.setLastName(lastn);
        System.out.println("Enter your city");
        String city =sc.next();
        p.setCity(city);
        System.out.println("Enter your state");
        String state =sc.next();
        p.setState(state);
        System.out.println("Enter your email");
        String email =sc.next();
        p.setEmail(email);
        System.out.println("Enter your phone number");
        int phNo =sc.nextInt();
        p.setPhoneNumber(phNo);
        System.out.println("Enter your zip code");
        int zip =sc.nextInt();
        p.setZip(zip);


    }
    public void UpdateContact(Person p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name of the contact to be updated :");
        String firstNameToUpdate = sc.next();
        if(firstNameToUpdate.equals(p.getFirstName())){
            System.out.println("Enter the new first name:");
            String newFirstname = sc.next();
            p.setFirstName(newFirstname);
            System.out.println("Enter the new last name:");
            String newLastname = sc.next();
            p.setLastName(newLastname);
            System.out.println("Enter new city");
            String newCity = sc.next();
            p.setCity(newCity);
            System.out.println("Enter new state");
            String newState = sc.next();
            p.setState(newState);
            System.out.println("Enter new email");
            String newEmail = sc.next();
            p.setEmail(newEmail);
            System.out.println("Enter new phone number");
            int newphNum = sc.nextInt();
            p.setPhoneNumber(newphNum);
            System.out.println("Enter new zip code");
            int newZip = sc.nextInt();
            p.setZip(newZip);
            System.out.println("Contact updated succesfully");

        }
        else{
            System.out.println("Contact not found");
        }
    }
}
