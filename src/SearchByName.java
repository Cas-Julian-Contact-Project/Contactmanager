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
        System.out.println("\nSearch by First and/or Last name: ");
        searchField = scanner.nextLine().toLowerCase();

        //loop through the searchName list and check if the searchField matches either the first name or the last name field
        for(String entry : searchName)
        {
            //split the list and assign it to firstLastName array
            String[] firstLastName = entry.split(" ");

            String firstName = firstLastName[0].toLowerCase();
            String lastName = firstLastName[1].toLowerCase();
            String firstLetterFirstName = String.valueOf(firstName.charAt(0));
            String firstLetterLastName = String.valueOf(lastName.charAt(0));
            String lettersInSequence = firstName.substring(0,3);
            String lettersInSequenceToo = lastName.substring(0,3);

            //if the searchField matches either the first or last name, display the name(s) to the user
            if(firstLetterFirstName.equalsIgnoreCase(searchField) || firstLetterLastName.equalsIgnoreCase(searchField) || lettersInSequence.equalsIgnoreCase(searchField) || lettersInSequenceToo.equalsIgnoreCase(searchField) || firstName.equalsIgnoreCase(searchField) || lastName.equalsIgnoreCase(searchField))
            {
                System.out.println(entry);
                isNameFound = "true";
            }
        }

        //if isNameFound false, display a message to the user letting them know that the name is not in the directory
        if(isNameFound.equals("false"))
        {
            System.out.printf("%nYour input %s is not in file.%n", searchField);
        }

        do
        {
            System.out.println("Would you like to search again? Yes or No?");
            searchField = scanner.nextLine();

            if (searchField.equalsIgnoreCase("Yes") || (searchField.equalsIgnoreCase("Y")))
            {
                searchByName(searchName);
//            } else if (searchField.equalsIgnoreCase("No") || searchField.equalsIgnoreCase("N"))
//            {
////                break;
            }
            else if(!searchField.equalsIgnoreCase("Yes") || (!searchField.equalsIgnoreCase("Y")) || !searchField.equalsIgnoreCase("No") || !searchField.equalsIgnoreCase("N"))
            {
                System.out.println("Please enter Yes or No?");
//                System.out.println("Would you like to search again? Yes or No?");
//                searchField = scanner.nextLine();
            }
        } while(searchField.equalsIgnoreCase("No") || (searchField.equalsIgnoreCase("N")));

    }
}