import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DeleteContact
{
    public static void deleteContact(List<String> deleteExistingContact)
    {
        Scanner scanner = new Scanner(System.in);

        int numberList = 1;

        int deleteSelection;

        //display a message to the user to select a number from the list to delete
        System.out.println("\nSelect number to delete: \n");

        //creat a for each to display the contacts to the user
        for(String entry : deleteExistingContact)
        {
            System.out.printf("%d - %s\n", numberList, entry);
            numberList++;
        }

        try
        {
            //prompt the user to select a contact to delete
            System.out.println("\nPlease make a selection:");
            //assign the user input to deleteSelection variable
            deleteSelection = scanner.nextInt();

            //remove the contact based on the user input
            deleteExistingContact.remove(deleteSelection - 1);
            System.out.println();

            DisplayContacts.displayContacts(deleteExistingContact);
        }
        catch(IndexOutOfBoundsException | InputMismatchException e)
        {
            System.out.println("\nYou must select from a number associated to the contact in order to delete, please try again");
            deleteContact(deleteExistingContact);
        }
    }
}
