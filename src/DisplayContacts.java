import java.util.List;

public class DisplayContacts
{
    public static void displayContacts(List<String> contactDisplay)
    {
        String nameField = "Name";
        String phoneNumberField = "Phone Number";
        System.out.printf("%-23s| %s   |%n",nameField, phoneNumberField);
        String stringSeparator = "-";
        System.out.println(stringSeparator.repeat(41));

        for(String contact : contactDisplay)
        {
            String[] contactIn = contact.split("\\|");
            String[] names = contactIn[0].split(" ");
            String[] phone = contactIn[1].split(" ");
            String newPhone = phone[1];

            System.out.printf("%-22s | ",contactIn[0]);

            if(newPhone.length() == 7)
            {
                System.out.printf("%s-%-10s |%n",newPhone.substring(0,3),newPhone.substring(3));
            }
            else
            {
                System.out.printf("(%s) %s-%-3s |%n",newPhone.substring(0,3),newPhone.substring(3,6),newPhone.substring(6));
            }
        }
    }
}
