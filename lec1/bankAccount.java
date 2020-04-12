import java.util.*;

class BankAccount
{
    final double INTEREST_RATE = 0.1;    

    double balance; // class attribute

    BankAccount(double theBalance) // BankAccount constructor 
    {
        // Initialise class attributes
        balance = theBalance;
    }

	// deposit is a procedure method, parameter amount
    void deposit(double amount)
    {
        balance = balance + amount;
    }

    double calcInterest()
    {
        double interest = balance * INTEREST_RATE;// local variable interest
        return interest;
    }

    void displayBalance()
    {
 System.out.println("The balance of your account is now: " + balance);
    }

    void withdraw(double amount) // parameter amount
    {
        balance = balance - amount;
    }
    
    void getLoginInfo()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = in.next(); // local variable username
        System.out.println("Please enter your PIN:");
        int pin = in.nextInt();// local variable pin
        // Continue login process... Check details etc
    }



    void startDeposit()
    {









    }
    
    void addBonus(double amount)
    {








    }

    
    void addInterest()
    {
















    }
}

class TestBankAccount
{
	BankAccount account;

    	TestBankAccount()
    	{        
        account = new BankAccount(500);
        
        // Perform a deposit
        account.deposit(150.0);
        
        // Calculate the interest due
        double interest = account.calcInterest();

        // Display the interest due         
System.out.println("The interest due on your account is: $" + interest);
        
        // Deposit the interest - NOTE: we can use a variable as an argument
        account.deposit(interest);
        
        // Disply the final balance
        account.displayBalance();

	  // Call startDeposit()






	 





    }

    

void findLargest()
    {
        int a=0, b=0, c=0;
        Scanner in = new Scanner(System.in);
System.out.println("Please enter three doubles: ");

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a > b)
        {
            if (a > c)
                System.out.println("Largest is " + a);
            else
                System.out.println("Largest is " + c);
        }
        else
        {
            if (b > c)
                System.out.println("Largest is " + b);
            else
                System.out.println("Largest is " + c);
        }
	}
}




