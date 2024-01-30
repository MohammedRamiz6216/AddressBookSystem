import java.sql.SQLOutput;
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
}
