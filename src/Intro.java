public class Intro extends Menu
{
    public static int intro()
    {
        try
        {
            //call menuFormat method and return it as an integer
            return Integer.parseInt(menuFormat());
        }
        catch(NumberFormatException e)
        {
            System.out.println("\nYou must enter a number between 1 - 5!!!");
            return intro();
        }
        catch (Exception e)
        {
            System.out.println("\nYou must enter a number between 1 - 5!!!");
            return intro();
        }
    }
}
