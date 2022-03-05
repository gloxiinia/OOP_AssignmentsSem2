//importing the scanner class
import java.util.Scanner;

public class Drills1_No13 {
    public static void main(String[] args){
        //creating input objects
        Scanner userInput1 = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        Scanner userInput3 = new Scanner(System.in);

        //prompting user input


        //while loop for input validation 

        while(true){
            System.out.println("Enter the three (3) values that will be used (Enter after each value): ");
            double a = userInput1.nextDouble();
            double b = userInput2.nextDouble();
            double c = userInput3.nextDouble();

            if (a == 0){
                //if else statement to handle if a == 0
                System.out.println("You can't divide by 0, please reenter your first value.");
            } else if (a != 0) {
                double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
                double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
                System.out.println("The roots of a 2nd grade polynomial with the values of " + a + "x^2 + " + b + "x + " + c + " are " + x1 + " and " + x2);
                break;
                
            } else {
                System.out.println("I can't seem to understand that, please try again.");
            }
        }


    }
}
