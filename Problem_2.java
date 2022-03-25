import java.util.Scanner;

public class Problem_2 {
    public static void printArrayInStars(){
        //creating objects for user input
        Scanner sc = new Scanner(System.in);

        //prompting user for size of the array
        System.out.println("");
        int NUM_ITEMS; 

        //input validation for positive integers using a do while loop, hasNextInt(), and next()
        do {
            System.out.println("Enter the number of items you'd like to store (must be a positive integer & not a zero): ");
            while (!sc.hasNextInt()) {
                System.out.println("Sorry, but that's not a valid input. Please reenter another value:");
                sc.next();
            }
            NUM_ITEMS = sc.nextInt(); 
        } while (NUM_ITEMS <= 0);

        //creating a new array named items based on the previous user input (NUM_ITEMS)
        int items[] = new int[NUM_ITEMS];

        //prompting user for array members
        System.out.println("Enter the items (separated by a space): ");

        //storing the user input in the items array
        for(int i=0; i<items.length; i++){  
            items[i]=sc.nextInt();
        }

        //printing the stars according to the array
        System.out.println("The array contents look like this:");
        for(int i = 0; i < items.length; i++){
            System.out.print(i + ": ");
            for(int j = 0; j < items[i]; j++){
                System.out.print('*');
            }
            System.out.println("("+ items[i] + ")");
        }
    }

    public static void main(String[] args){
        printArrayInStars();
    }
}
