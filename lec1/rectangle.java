class Rectangle
{
    double length;
    double height;
    
    Rectangle(double theLength, double theHeight)
    {
        length = theLength;
        height = theHeight;
    }
    
    double calcArea()
    {
        double result = length * height;
        return result;
    }
    
    // calcPerimter







    double calcCost(int price)
    {
        double result = price * 2 *(length + height);
        return result;
    }
    


}

class TestRectangle
{
    Rectangle myRec;
    Rectangle()
    {
        myRec = new Rectangle(3,4);
        double area = myRec.calcArea();
        





    }
}
