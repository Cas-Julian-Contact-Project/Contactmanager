import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactDirectory
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> contactInfo = new ArrayList<>();
        int exitQuestion = 0;
        do {
//            menuFormat(scanner);
//
//            System.out.println("Continue or Exit?");
            exitQuestion = menuFormat(scanner);

            switch(exitQuestion)
            {
                case 1:
                    viewContacts(contactInfo);
                    break;
                case 2:
                    addNewContact(contactInfo);
                    break;
                case 3:
                    System.out.println("Search a contact by name.");
                    break;
                case 4:
                    System.out.println("Delete an existing contact.");
                    break;
                default:
                    System.out.println("Contents REWRITTEN to txt file.");
            }
        } while(!(exitQuestion == 5));
    }

    public static void viewContacts(ArrayList<String> viewableDirectory)
    {
        for(String entry : viewableDirectory)
        {
            System.out.println(entry);
        }
    }

    public static int menuFormat(Scanner scanner)
    {
        System.out.println("1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4, or 5):");
        return scanner.nextInt();
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
       /* Prompt User Entering Name/Phone Number; */
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
