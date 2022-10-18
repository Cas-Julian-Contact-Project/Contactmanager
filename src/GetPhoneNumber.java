import java.util.Scanner;

public class GetPhoneNumber
{
    public static long getPhoneNumber()
    {
        Scanner scanner = new Scanner (System.in);
        long phoneNumber = 1111111111;
        try
        {
            String thePhoneNumber = "";
            System.out.println("Enter Phone Number: ");
            thePhoneNumber = scanner.next();

            //if the phone number meets the proper requirements then assign it to phoneNumber variable and return phoneNumber
            if(Long.parseLong(thePhoneNumber) >= 1111111 && Long.parseLong(thePhoneNumber) <= 9999999999L && (thePhoneNumber.length() == 7 || thePhoneNumber.length() == 10))
            {
                phoneNumber =  Long.parseLong(thePhoneNumber);
                return phoneNumber;
            }
            //display a message to the user letting them know that they phone number input is not correct
            else
            {
                System.out.printf("Sorry but you entered %s, and the phone number must be between 7 or 10 digits long!%n",thePhoneNumber);
                System.out.println();
                return getPhoneNumber();
            }

        }
        catch(NumberFormatException e)
        {
            System.out.println("\nThe phone number must be between 7 or 10 digits long!!!");
            return getPhoneNumber();
        }
        catch (Exception e)
        {
            System.out.println("\nThe phone number must be between 7 or 10 digits long!!!");
            return getPhoneNumber();
        }
    }
}
