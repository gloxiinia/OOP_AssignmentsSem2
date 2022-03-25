import java.util.Scanner;

public class Problem_1 {
    public static void PrintArray(){

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

        //printing the contents of the array with a for loop
        System.out.println("The contents of the array are: ");
        System.out.print('[');
        for(int i = 0; i < items.length; i++){
            if (i != items.length - 1){
                System.out.print(items[i]+ ", ");
            }else{
                System.out.print(items[i]+ "]");
            }
        }
    }

    //running the PrintArray method
    public static void main(String[] args){
        PrintArray();
    }
}
