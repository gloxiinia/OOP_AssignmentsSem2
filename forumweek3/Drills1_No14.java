//import scanner class
import java.util.Scanner;

public class Drills1_No14 {
    public static void main(String[] args){
        //creating input objects with the scanner class
        Scanner userInput = new Scanner(System.in);

        //prompting user input
        System.out.print("Enter a value in the form of seconds (make sure it's an integer): ");
        int timeInput = userInput.nextInt();

        //converting to the hours, minutes, secs format

        int timeHour = timeInput/3600;
        int timeMin = (timeInput%3600)/60;
        int timeSec = timeInput%60;

        //printing the result
        System.out.println(timeInput + " seconds is " + timeHour + " hour(s), " + timeMin + " minute(s), and " + timeSec + " second(s)");
    }
}
