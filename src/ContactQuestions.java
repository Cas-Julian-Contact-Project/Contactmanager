import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;

public class ContactQuestions extends DisplayContacts
{
    public static void contactQuestions()
    {
        List<String> contactInfo;
        int exitQuestion;
        String curDir = System.getProperty("user.dir");
        String directory = curDir + "/src/";

        try
        {
            /* Read File */
            Path filepath = Paths.get(directory, "contact.txt");

            if (! Files.exists(filepath))
            {
                Files.createFile(filepath);
            }

            contactInfo = Files.readAllLines(filepath);

            displayContacts(contactInfo);

            do {
                exitQuestion = Intro.intro();

                switch(exitQuestion)
                {
                    case 1:
                        ViewContacts.viewContacts(contactInfo);
                        break;
                    case 2:
                        AddContacts.addNewContact(contactInfo);
                        break;
                    case 3:
                        SearchByName.searchByName(contactInfo);
                        break;
                    case 4:
                        DeleteContact.deleteContact(contactInfo);
                        break;
                    case 5:
                        Files.write(filepath, contactInfo);
                        System.out.println();
                        displayContacts(contactInfo);
                        break;
                    default:
                        System.out.println("\nSorry but you have to enter a number from 1 - 5");
                }
            } while(!(exitQuestion == 5));
        }
        catch(InputMismatchException e)
        {
            System.out.println("\nSorry but you have to enter a number from 1 - 5");
        }
        catch (Exception e)
        {
            System.out.println("\nSorry but you have to enter a number from 1 - 5");
            e.printStackTrace();
        }
    }
}
