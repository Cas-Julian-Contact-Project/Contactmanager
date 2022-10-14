import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        ArrayList<String> contactInfo = new ArrayList<>();
        String exitQuestion = "";
        do {
            addNewContact(contactInfo);
            System.out.println("Continue or Exit?");
        } while();

    }

    public static void addNewContact(ArrayList<String> addContactInfo)
    {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        firstName = "";
        String lastName;
        lastName = "";
        long phoneNumber;
        phoneNumber = 0;
        String formatContacts;
        System.out.println("Enter First Name: ");
        firstName = scanner.next();
        System.out.println("Enter Last Name: ");
        lastName = scanner.next();
        System.out.println("Enter Phone Number: ");
        phoneNumber = scanner.nextLong();
        System.out.println("");
        Contact newContactInput = new Contact(firstName, lastName, phoneNumber);
        formatContacts = newContactInput.getFirstName() + " " + newContactInput.getLastName() + " | " + newContactInput.getPhoneNumber();
        addContactInfo.add(formatContacts);
        for(String entry : addContactInfo)
        {
            System.out.println(entry);
        }
    }
}
