/**
 * This program simulates a simple calculator
 */

class Calculator
{
    // Attributes
    int numberOne, numberTwo;

    Calculator()
    {
        numberOne = 5;
        numberTwo = 7;
    }

    /**
     * NEW Constructor Calculator()
     * - loads the program into memory
     * - assigns values for the attributes using parameters
     */
    Calculator(int theNumberOne, int theNumberTwo)
    {
        numberOne = theNumberOne;
        numberTwo = theNumberTwo;
    }
    
// Add the two numbers and display the result
    void add()
    {
System.out.println(“Addition result is: ” + (numberOne + numberTwo));
    }

	// Write displayNumbers() here












// Square the parameter num e.g. 5^2 = 25
void squareNumber(int num)
{
	 System.out.print(“Square result: ”);
	 System.out.println(num * num);
}







}


class TestCalculator
{
	Calculator calc1, calc2;

	TestCalculator()
	{
		// Calling new Calculator() needs parameters!!!
		calc1 = new Calculator(                );
		calc2 = new Calculator(                );
			
		// Call the method add()
		calc1.add();
		calc2.add();




		// Call the method squareNumber(int num)



		
	}
}
