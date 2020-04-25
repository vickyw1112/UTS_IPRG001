public class Australian
{
    private int id;
    private String language;
    private String name;
    private String food;
    private String colour;
   
    public Australian(String theName, String theLanguage, String theFood, String theColour)
    {
        language = theLanguage;
        name = theName;
        food = theFood;
        colour = theColour;
    }
    
    public void displayLanguage()
    {
        System.out.println("An Australian speaks " + language);
    }      

    public void displayColour()
    {
        System.out.println("An Australian likes " + colour + " colour");
        
    }    

    public void displayFood()
    {
        System.out.println("My name is " + name + " and I like to eat " + food);
    }         
}
