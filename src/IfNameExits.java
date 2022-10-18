import java.util.List;
import java.util.Scanner;

public class IfNameExits
{
    public static String checkIfNameExists(String firstName, String lastName, List<String> contactList)
    {
        Scanner scanner = new Scanner(System.in);
        String changeName = "";

        int count = 0;
        String formatContacts = "";

        if(contactList.isEmpty())
        {
            return changeName;
        }

        for(String name : contactList)
        {
            //split the contactList and assign it to theFirstName and theLastName variables
            String[] firstLastName = name.split(" ");
            String theFirstName = firstLastName[0];
            String theLastName = firstLastName[1];

            //if theFirstName and theLastName are equal to firstName and lastName, display a message to the user letting them know that this contact already exists
            if(firstName.equalsIgnoreCase(theFirstName) && lastName.equalsIgnoreCase(theLastName))
            {
                //display a message to the user asking if they wish to overwrite the phone number
                System.out.printf("There's already a contact named %s %s. Do you want to overwrite the phone number? (Yes/No)%n", firstName, lastName);
                changeName = scanner.nextLine();
                break;
            }
            count++;
        }

        //if the answer is yes, call getPhoneNumber method and assign it to phoneNumber, append the contactList for that contact
        if(changeName.equalsIgnoreCase("yes"))
        {
            System.out.println();
            long phoneNumber = GetPhoneNumber.getPhoneNumber();

            //assign the firstName, lastName and phoneNumber to formatContacts
            formatContacts = firstName + " " + lastName + " | " + phoneNumber;

            contactList.set(count, formatContacts);

            return changeName;
        }
        else if(changeName.equalsIgnoreCase("no") || changeName.equals(""))
        {
            return changeName;
        }

        else
        {
            System.out.println("\nSorry but you must enter a Yes/No, please try again\n");
            return checkIfNameExists(firstName, lastName, contactList);
        }

    }
}
