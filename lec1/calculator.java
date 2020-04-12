class Calculator
{
    // Attributes
    int numberOne, numberTwo;

    /**
     * Constructor Calculator()
     * - loads the program into memory
     * - assigns values for the attributes
     */
    Calculator()
    {
        numberOne = 5;
        numberTwo = 7;

    }

    /**
* Add the two numbers and display the result
     */
    void add()
    {


    }
}

class TestCalculator
{
	Calculator calc1, calc2;

	TestCalculator()
	{
		// Create two different calculator objects
		calc1 = new Calculator();
		calc2 = new Calculator();
			
		// Call the method add for both loaded programs
		calc1.add();
		calc2.add();
	}
}
