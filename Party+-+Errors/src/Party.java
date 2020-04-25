public class Party
{
    public static void main(String args[]) {
       Party p = new Party(); 
       p.allDisplayColour();
    
    }

    private Australian ausRick;
    private Australian ausTim;
    private French freFleur;
    private Italian itaGiani;
    
    public Party()
    {
        ausRick = new Australian("Rick", "English", "Oranges", "pink");
        ausTim = new Australian("Tim", "English", "Apples", "green");
        freFleur = new French(1, "Fleur", "melon", "black");
        itaGiani = new Italian(1, "Giani", "meat", "white");   
        allDisplayLanguage();
        allDisplayFood();
        //allDisplayColour();
       //allShareFavouriteFood();
    }
    
    private void allDisplayLanguage()
    {
        ausRick.displayLanguage();
        ausTim.displayLanguage();
        freFleur.displayLanguage();
        itaGiani.displayLanguage();
    }       
    
    private void allDisplayFood()
    {
        ausRick.displayFood();
        ausTim.displayFood();        
        freFleur.displayFood();
        itaGiani.displayFood();
    }

    private void allDisplayColour()
    {
        ausRick.displayColour();
        ausTim.displayColour();
        freFleur.displayColour();
        itaGiani.displayColour();
    }

}
