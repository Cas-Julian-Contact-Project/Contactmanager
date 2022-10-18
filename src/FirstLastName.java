import java.util.Scanner;

public class FirstLastName
{
    public static String getFirstLastName(Scanner scanner, String question)
    {
        String name = "";

        System.out.println(question);
        name = scanner.nextLine();

        System.out.println();

        //split the question and assign it to a String array named stringQuestion
        String[] stringQuestion = question.split(" ");

        //convert the second element of stringQuestion to lowercase
        stringQuestion[1] = stringQuestion[1].toLowerCase();

        char[] nameCharArr = name.toCharArray();
        //create a boolean named returnName and assign true to it
        boolean returnName = true;

        for(char c : nameCharArr)
        {
            //if the char of the name has a digit display a message to the user, assign false to returnName
            if(Character.isDigit(c))
            {
                System.out.printf("Sorry but the %s name cannot contain any digits only letters, please try again%n", stringQuestion[1]);
                returnName = false;
                break;
            }
            //if the char of the name has a blank space display a message to the user, assign false to returnName
            else if(Character.isWhitespace(c))
            {
                System.out.printf("Sorry but the %s name cannot contain any blank spaces only letters, please try again%n", stringQuestion[1]);
                returnName = false;
                break;
            }
        }

        //if returnName is true then return the name
        if(returnName)
        {
            return name;
        }
        //if the returnName is not true call getFirstLastName method
        else
        {
            return getFirstLastName(scanner, question);
        }
    }
}
