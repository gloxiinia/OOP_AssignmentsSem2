
//importing scanner class
import java.util.Scanner;

public class Drills1_No10 {
    //creating the methods to find the mean, variance, and standard deviation
    public static double getMean(double a, double b, double c){
        return (a + b + c)/3;
    }
    public static double getVariance(double a, double b, double c){
        double mean = (a + b + c)/3;
        return (Math.pow((a - mean), 2) + Math.pow((b - mean), 2) + Math.pow((c - mean), 2))/3;
    }
    public static double getDeviation(double a, double b, double c){
        double mean = (a + b + c)/3;
        double variance = (Math.pow((a - mean), 2) + Math.pow((b - mean), 2) + Math.pow((c - mean), 2))/3;
        return Math.sqrt(variance);
    }
    public static void main(String[] args){
        //creating objects for user input
        Scanner userInput1 = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        Scanner userInput3 = new Scanner(System.in);
        Scanner userInputmode = new Scanner(System.in);

        //prompting user for input
        System.out.println("Enter the three (3) values that will be used (Enter after each value): ");
        double a = userInput1.nextDouble();
        double b = userInput2.nextDouble();
        double c = userInput3.nextDouble();

        
        //if statements to process the user's selection
        while (true) {   
            System.out.println("Please select which mode you would like to use:");
            System.out.println("1. Calculate Mean\n2. Calculate Variance\n3. Calculate Standard Deviation\n4. Calculate all");
            int selection = userInputmode.nextInt();
            System.out.println("------------------------------------------------------------------------");
            if (selection == 1){
                System.out.println("The mean of the values " + a + ", " + b + ", and " + c + " is " +  getMean(a, b, c));
                break;

            } else if (selection == 2){
                System.out.println("The variance of the values " + a + ", " + b + ", and " + c + " is " +  getVariance(a, b, c));
                break;

            } else if (selection == 3){
                System.out.println("The standard deviation of the values " + a + ", " + b + ", and " + c + " is " +  getDeviation(a, b, c));
                break;

            } else if (selection == 4) {
                System.out.println("The mean of the values " + a + ", " + b + ", and " + c + " is " +  getMean(a, b, c));
                System.out.println("Its variance is " +  getVariance(a, b, c));
                System.out.println("And its standard deviation is " +  getDeviation(a, b, c));    
                break;            
            } else {
                System.out.println("Whoops! Sorry, but that's not a valid option, please retry.");
            }

        }


    }
}
