
//importing the scanner class
import java.util.Scanner;

//importing DecimalFormat and Rounding for rounding any decimals
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Drills1_No9 {
    public static void main(String[] args){

        //creating userInput object using the Scanner class
        Scanner userInput = new Scanner(System.in);
        
        //creating df object using the DecimalFormat class to round the decimal to at least 3rd decimal places
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        //declaring the celsiusInput and fahrOutput variable for storing the user input in celsius and fahrenheit
        double celsiusInput;
        double fahrOutput;

        //creating the prompt for user input
        System.out.println("Enter the desired temperature for conversion (Celsius to Fahrenheit): ");
        celsiusInput =  userInput.nextDouble();

        //calculation and conversion from Celsius to Fahrenheit
        fahrOutput = (9 * celsiusInput + 160)/5;


        //printing the original temp value and the conversion result
        System.out.println(df.format(celsiusInput) + "\u00B0C is " + df.format(fahrOutput) + "\u00B0F (Rounded to 3rd decimal places, if applicable).");

    }
}
