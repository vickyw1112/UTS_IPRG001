import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class Roulette {
    String player1;
    String player2;
    int maxScore;
    String colourA;
    String colourB;
    Roulette(String name1, String name2, int score, String a, String b) {
        this.player1 = name1;
        this.player2 = name2;
        this.maxScore = score;
        this.colourA = a;
        this.colourB = b;
    }
    
    void displayColours() {
        System.out.println("Colour A is: " + this.colourA + " and Colour B is " + this.colourB);
    }

    void spin() {
        long res = Math.round(Math.random() * this.maxScore + 0.5);
        long field = res % this.maxScore;
        if (field % 2 == 0) {
            System.out.println("Congratulations! You have spun a " + this.colourA + res);
        }
        else {
            System.out.println("Congratulations! You have spun a " + this.colourB + res);
        }
    }

    void playRoulette(){
        System.out.println("Enter the number of times you want to play (1/2/3):");
        int numOfSpins;
        Scanner scanIn = new Scanner(System.in);
        numOfSpins = scanIn.nextInt();
        scanIn.close();

        if (numOfSpins != 1 && numOfSpins != 2 && numOfSpins != 3) {
            System.out.println("Aha, wrong");
            int right = -1;
            while (right == -1) {
                System.out.println("Enter the number of times you want to play (1/2/3):");
                scanIn = new Scanner(System.in);
                numOfSpins = scanIn.nextInt();
                if (numOfSpins != 1 && numOfSpins != 2 && numOfSpins != 3) {
                    continue;
                }

            }
            
        } else if (numOfSpins == 1 || numOfSpins == 2 || numOfSpins == 3) {
            switch (numOfSpins) {
                case 1:
                    System.out.println("You can spin once");
                    spin();
                    break;
                case 2:
                    System.out.println("You can spin twice");
                    spin();
                    spin();
                    break;
                case 3:
                    System.out.println("You can spin third times");
                    spin();
                    spin();
                    spin();
                    break;
            }
    
        }
    }

    public static void main(String args[]) {
        String name1;
        String name2;
        String colourA;
        String colourB;
        int score;

        Scanner scanIn = new Scanner(System.in);

        System.out.println("Please enter player 1 name:");
        name1 = scanIn.nextLine();
        
        System.out.println("Please enter player 2 name:");
        name2 = scanIn.nextLine();

        System.out.println("Please enter color A:");
        colourA  = scanIn.nextLine();
        
        System.out.println("Please enter color B:");
        colourB  = scanIn.nextLine();

        System.out.println("Please enter max score:");
        score  = scanIn.nextInt();
        
        System.out.println("Spinners are loaded and ready to play.");
       
        Roulette r = new Roulette(name1, name2, score, colourA, colourB);
        r.displayColours();
        r.playRoulette();

        scanIn.close();
    }
}
