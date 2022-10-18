import java.util.List;
import java.util.Scanner;

public class SearchByName
{
    public static void searchByName(List<String> searchName)
    {
        Scanner scanner = new Scanner(System.in);
        //create a boolean variable named isNameFound and assign it to true;
        boolean isNameFound = true;

        //create a String variable and name it searchField and assign the input of the user to this variable
        String searchField;

        //prompt the user to search by first or last name
        System.out.println("\nSearch by First and/or Last name: ");
        searchField = scanner.next();

        //loop through the searchName list and check if the searchField matches either the first name or the last name field
        for(String entry : searchName)
        {
            //split the list and assign it to firstLastName array
            String[] firstLastName = entry.split(" ");

            //if the searchField matches either the first or last name, display the name(s) to the user
            if(firstLastName[0].equalsIgnoreCase(searchField) || firstLastName[1].equalsIgnoreCase(searchField))
            {
                System.out.println();
                System.out.println(entry);
                //assign true to isNameFound
                isNameFound = true;
                break;
            }
            //if there are no names that match assign false to isNameFound
            else {
                isNameFound = false;
            }
        }
        //if isNameFound false, display a message to the user letting them know that the name is not in the directory
        if(!isNameFound)
        {
            System.out.printf("%nYour input %s is not in directory.%n", searchField);
        }
    }
}
