import java.util.Scanner;

public class Menu
{
    public static String menuFormat()
    {
        Scanner scanner = new Scanner(System.in);

        String answer;

        //display a menu for the user to pick from
        System.out.println("\n1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4, or 5):");
        answer =  scanner.nextLine();
        return answer;
    }
}
