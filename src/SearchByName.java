import java.util.List;
import java.util.Scanner;

public class SearchByName
{
    public static void searchByName(List<String> searchName)
    {
        Scanner scanner = new Scanner(System.in);
        //create a boolean variable named isNameFound and assign it to true;
        String isNameFound = "false";

        //create a String variable and name it searchField and assign the input of the user to this variable
        String searchField;

        //prompt the user to search by first or last name
        System.out.println("\nSearch our contact list by:\n\nEntering the first letter of the first or last name\nEntering the first three letters of the first or last name\nEntering the first name\nEntering the last name\nEntering the first and last name\n\nPlease enter a name: ");
        searchField = scanner.nextLine().toLowerCase();

        System.out.println();

        //loop through the searchName list and check if the searchField matches either the first name or the last name field
        for(String entry : searchName)
        {
            //split the list and assign it to firstLastName array
            String[] firstLastName = entry.split(" ");

            String firstName = firstLastName[0].toLowerCase();
            String lastName = firstLastName[1].toLowerCase();
            String firstLetterFirstName = String.valueOf(firstName.charAt(0));
            String firstLetterLastName = String.valueOf(lastName.charAt(0));
            String firstNameLettersInSequence = firstName.substring(0,3);
            String lastNameLettersInSequence = lastName.substring(0,3);
            String fullName = firstName + " " + lastName;

            //if the searchField matches either the first or last name, display the name(s) to the user
            if(firstLetterFirstName.equalsIgnoreCase(searchField) || firstLetterLastName.equalsIgnoreCase(searchField) || firstNameLettersInSequence.equalsIgnoreCase(searchField) || lastNameLettersInSequence.equalsIgnoreCase(searchField) || firstName.equalsIgnoreCase(searchField) || lastName.equalsIgnoreCase(searchField) || fullName.equalsIgnoreCase(searchField))
            {
                System.out.println(entry);
                isNameFound = "true";
            }
        }

        System.out.println();

        //if isNameFound false, display a message to the user letting them know that the name is not in the directory
        if(isNameFound.equals("false"))
        {
            System.out.printf("%nYour input %s is not in file.%n%n", searchField);
        }

        boolean continueAsking = false;

        String answer = "";
        Scanner scanner1 = new Scanner(System.in);

        do
        {

            System.out.println("Would you like to search again? Yes or No?");
            answer = scanner1.next();

            if (answer.equalsIgnoreCase("Yes") || (answer.equalsIgnoreCase("Y")))
            {
                searchByName(searchName);
            }
            else if(answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N"))
            {
                continueAsking = false;
            }
            else
            {
                System.out.println("\nPlease enter Yes or No?");
                System.out.println();
                continueAsking = true;
            }
        } while(continueAsking == true);

    }
}