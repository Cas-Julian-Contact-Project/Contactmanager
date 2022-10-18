import java.util.List;

public class ViewContacts extends DisplayContacts
{
    public static void viewContacts(List<String> viewableDirectory)
    {
        System.out.println();

        //call displayContacts and pass viewableDirectory as an argument
        displayContacts(viewableDirectory);
    }
}
