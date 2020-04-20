public class Bike
{
    private String colour;
    private Wheel frontWheel;
    private Wheel backWheel;
    public final int numOfWheels = 4;
    
    // Constant for the number of wheels
       



    public Bike(String color, Wheel front, Wheel back)
    {  
    
        colour = color;
        frontWheel = front;
        backWheel = back;

    }
    
    private void displayColour()
    {
        System.out.println("The bike is " + colour);    
    }
    
    public void moveForward(double distance)
    {
        frontWheel.moveForward(distance);
        backWheel.moveForward(distance);
    }
	
    // moveBackwards method
    public void moveBackward(double distance)
    {
        frontWheel.moveBackward(distance);
        backWheel.moveBackward(distance);
    }
    
    public void setColour(String color) {
        this.colour = color;
    }

    public String getColour() {
        return this.colour;
    }
    

	// Accessors & mutators



















public String toString()
{
return “Colour = “ + colour + “, front wheel position is = “ + frontWheel.getPosition() + “, back wheel position is = “ + backWheel.getPosition();
}

}




public class Wheel
{
    private double position;
    
    public Wheel(double thePosition)
    {
        position = thePosition;
    }
    
    public void moveForward(double distance)
    {
        position = position + distance;
    }    
    
    public void moveBackward(double distance)
    {
        position = position - distance;
    }    
    
	// Accessors & mutators

    public double getPosition() {
        return position;
    }

    public void setPosition(int pos) {
        position = pos;
    }



	// toString() example sentence is: “position is = 5”
    public String toString()
    {
        return "position is =" + position;
    }





}
public class TestBike
{
    Bike b1, b2;

    TestBike()
    {

        Wheel front = new Wheel(2);
        Wheel back = new Wheel(5);
        b1 = new Bike("pink", front, back);

        front = new Wheel(6);
        back = new Wheel(10);
        b2 = new Bike("green", front, back);

        

        String colour = b1.getColour(); //call accessor getColour()
        System.out.println(“My bike is currently painted: “ + colour);

                b1.setColour(“Green”); //call mutator setColour()
        System.out.println(“My bike is now painted: “ + b1.getColour());

        
    }
}
