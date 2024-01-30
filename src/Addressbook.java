import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Addressbook {
    HashMap<Integer,Person> contactList = new HashMap<>();
    public void addPerson(int id, Person person){
        contactList.put(id,person);
    }
    public void deletePerson(String firstName, String lastName){
        for(Map.Entry<Integer,Person> entry : contactList.entrySet()){
            Person person = entry.getValue();
            if (person.getFirstName().equals(firstName) &&  person.getLastName().equals(lastName)){
                contactList.remove(entry.getKey());
                System.out.println("Person" + firstName+" "+ lastName+ "deleted successfully");
                return;
            }
        }
        System.out.println("Person address not found");
    }
}
