public class French
{
    private int id;
    private final String LANGUAGE = "French";
    private String name;
    private String food;
    private String colour;

    public French(int theId, String theName, String theFood, String theColour)
    {
        id = theId;
        name = theName;
        food = theFood;
        colour = theColour;
    }            

    public String getFood() {
        return food;
    }

    public void setFood(String theFood) {
        food = theFood;
    }

    public void displayFood() {
        System.out.println("France people loves " + food);
    
    }

    public void displayColour() {
        System.out.println("France people loves " + colour + " colour");
    }

    public void displayLanguage()
    {
        System.out.println("In France most people speak " + LANGUAGE);
    }      
}
