import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactDirectory
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> contactInfo = new ArrayList<>();
        int exitQuestion = 0;
        do {
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
                    searchByName(contactInfo);
                    break;
                case 4:
                    deleteContact(contactInfo);
                    break;
                default:
                    System.out.println("Contents REWRITTEN to txt file.");
            }
        } while(!(exitQuestion == 5));
    }

    public static int menuFormat(Scanner scanner)
    {
        System.out.println();

        System.out.println("1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4, or 5):");
        return scanner.nextInt();
    }

    public static void viewContacts(List<String> viewableDirectory)
    {
        System.out.println();

        for(String entry : viewableDirectory)
        {
            System.out.println(entry);
        }
        System.out.println();

    }

    public static void addNewContact(List<String> addContactInfo)
    {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        firstName = "";
        String lastName;
        lastName = "";
        long phoneNumber;
        phoneNumber = 0;

        System.out.println();

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
        System.out.println();

    }

    public static void searchByName(List<String> searchName)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isNameFound;
        isNameFound = true;
        String searchField;
        searchField = "";
        System.out.println("Search by First and/or Last name: ");
        searchField = scanner.next();

        for(String entry : searchName)
        {
            if(entry.contains(searchField))
            {
                System.out.println(entry);
                isNameFound = true;
                break;
            } else {
                isNameFound = false;
            }
        }
        if(!isNameFound)
        {
            System.out.printf("Your input %s is not in directory.", searchField);
        }
    }

    public static void deleteContact(List<String> deleteExistingContact)
    {
        Scanner scanner = new Scanner(System.in);

        int numberList;
        numberList = 1;

        int deleteSelection;
        deleteSelection = 0;

        System.out.println("Select number to delete: \n");

        for(String entry : deleteExistingContact)
        {
            System.out.printf("%d - %s\n", numberList, entry);
            numberList++;
        }

        System.out.println("\nPlease make a selection:");
        deleteSelection = scanner.nextInt();

        deleteExistingContact.remove(deleteSelection - 1);
        System.out.println();
    }

}
