public class Italian
{
    private int id;
    private final String LANGUAGE = "Italian";
    private String name;
    private String food;
    private String colour;

    public Italian(int theId, String theName, String thefood, String theColour)
    {
        id = theId;
        name = theName;
        food = thefood;
        colour = theColour;
    }      
      

    public void displayFood()
    {
        System.out.println("An Italian loves " + food);
    }    
    
    public void displayColour()
    {
        System.out.println("An Italian loves " + colour + " colour");
    }    
    
    public void displayLanguage()
    {
        System.out.println("An Italian speaks " + LANGUAGE);
    }    
  
} 
