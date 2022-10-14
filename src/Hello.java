import java.util.ArrayList;
import java.util.List;

public class Hello
{
    public static void main(String[] args)
    {
        String firstName;
        firstName = "Cas";
        String lastName;
        lastName = "Ugly";
        long phoneNumber;
        phoneNumber = 8675309;
        String formatContacts;
        formatContacts = "";

        Contact contact = new Contact(firstName, lastName, phoneNumber);

        formatContacts = contact.getFirstName() + " " + contact.getLastName() + " | " + contact.getPhoneNumber();
        ArrayList<String> contactInfo = new ArrayList<>();
        contactInfo.add(formatContacts);
//        ArrayList<String> help = new ArrayList<>();
//        help.add(formatContacts);
//
//        System.out.println(help);
//
        for(String entry : contactInfo)
        {
            System.out.println(entry);
        }
    }
}
