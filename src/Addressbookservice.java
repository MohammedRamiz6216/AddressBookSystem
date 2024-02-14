
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
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
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        System.out.println("Enter your email");
        String email = sc.next();
        while (!Pattern.matches(emailRegex, email)) {
            System.out.println("Invalid email format. Please enter a valid email");
            email = sc.next();
        }
        p.setEmail(email);

        // Validate phone number using regex
        String phoneNumberRegex = "^\\+?[0-9-]+$";
        System.out.println("Enter your phone number");
        String phNo = sc.next();
        while (!Pattern.matches(phoneNumberRegex, phNo)) {
            System.out.println("Invalid phone number format. Please enter a valid phone number");
            phNo = sc.next();
        }
        p.setPhoneNumber(phNo);

        // Validate zip code using regex
        String zipCodeRegex = "\\d{5}";
        System.out.println("Enter your zip code");
        String zip = sc.next();
        while (!Pattern.matches(zipCodeRegex, zip)) {
            System.out.println("Invalid zip code format. Please enter a valid zip code");
            zip = sc.next();
        }
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
            String newphNum = sc.next();
            p.setPhoneNumber(newphNum);
            System.out.println("Enter new zip code");
            String newZip = sc.next();
            p.setZip(newZip);
            System.out.println("Contact updated succesfully");

        }
        else{
            System.out.println("Contact not found");
        }
    }
}
