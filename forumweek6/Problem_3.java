
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Problem_3 {

    public static void printGrades(){
        //creating objects for user input
        Scanner sc = new Scanner(System.in);

        //prompting user for size of the array
        System.out.println("");
        int num_students; 

        //input validation for positive integers using a do while loop, hasNextInt(), and next()
        do {
            System.out.println("Enter the number of students: ");
            while (!sc.hasNextInt()) {
                System.out.println("Sorry, but that's not a valid input. Please reenter another value:");
                sc.next();
            }
            num_students = sc.nextInt(); 
        } while (num_students <= 0);

        //creating a new array named grades based on the previous user input (num_students)
        int grades[] = new int[num_students];


        //prompting user for array members
        //input validation for grades, is it between 0 and 100?
        //storing the user input in the grades array
        int check = 0;
        boolean check2;
        int studentNum = 1;
        while(check == 0){
            check2 = true;
            studentNum = 1;
            for(int i=0; i<grades.length; i++){
                System.out.println("Enter the grade for student number " + studentNum +": ");  
                grades[i]=sc.nextInt();
                studentNum++;
            }
            
            for(int i=0; i<grades.length; i++){ 
                if(grades[i] < 0 || grades[i] > 100){
                    System.out.println("That's not a valid input. Please make sure the grade is between 0 and 100.\n");
                    check2 = false;
                    break;
                }else {
                    continue;
                }
            }

            if(check2 == false){
                continue;
            }else{
                check = 1;
            }
        }


        //computing the average grade
        
        double average;
        average = 0;

        for(int i=0; i<grades.length; i++){  
            average += grades[i];
        }
        
        //dividing by the number of students
        average /= grades.length;

        //using decimal format to round off to 2nd dec place
        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("The average grade is: " + f.format(average));

        //computing the min and max grades
        Arrays.sort(grades); //using the sort function to sort the array in ascending order
        System.out.println("The minimum grade is: " + grades[0]);
        System.out.println("The maximum grade is: " + grades[grades.length - 1]);

    }

    public static void main(String[] args){
        printGrades();
    }
}
