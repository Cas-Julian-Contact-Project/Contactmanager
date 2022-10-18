import java.util.List;
import java.util.Scanner;

public class AddContacts
{
    public static void addNewContact(List<String> addContactInfo)
    {
        Scanner scanner = new Scanner(System.in);
        //create a long variable to store the phoneNumber
        long phoneNumber;

        System.out.println();

        //create a String variable named formatContacts to store the first name, last name, and phone number
        String formatContacts;

        //call getFirstLastName method, make sure to make the name lowercase, and assign it to firstName variable
        String firstName = FirstLastName.getFirstLastName(scanner, "Enter First Name: ").toLowerCase();

        //make the first letter of firstName uppercase
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        //call getFirstLastName method, make sure to make the name lowercase, and assign it to lastName variable
        String lastName = FirstLastName.getFirstLastName(scanner, "Enter Last Name: ").toLowerCase();

        //make the first letter of lastName uppercase
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        //call checkIfNameExits, pass firstName, lastName, and addContactInfo, and assign the returned String to editContact variable
        String editContact = IfNameExits.checkIfNameExists(firstName, lastName, addContactInfo);

        //call displayContacts and pass addContactInfo if editContact is either yes or no
        if(editContact.equalsIgnoreCase("no") || editContact.equalsIgnoreCase("yes"))
        {
            System.out.println();
            DisplayContacts.displayContacts(addContactInfo);
        }
        else if(editContact.equals(""))
        {
            //call getPhoneNumber method and assign it to phoneNumber
            phoneNumber = GetPhoneNumber.getPhoneNumber();

            Contact newContactInput = new Contact(firstName, lastName, phoneNumber);

            //assign the first name, last name, and phone number to formatContacts
            formatContacts = newContactInput.getFirstName() + " " + newContactInput.getLastName() + " | " + newContactInput.getPhoneNumber();

            //add formatContacts to addContactInfo
            addContactInfo.add(formatContacts);
            System.out.println();

            //call displayContacts and pass addContactInfo
            DisplayContacts.displayContacts(addContactInfo);
        }
    }
}
