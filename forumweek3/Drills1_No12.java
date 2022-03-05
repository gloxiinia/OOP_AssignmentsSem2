
public class Drills1_No12 {
    public static void main(String[] args){
        //printing the header for the tables
        System.out.println("\tNumber\t|\tSquare\t|\tCube\t|");

        //for loop to iterate through the numbers
        //also using math.round() to round the output to the nearest integer
        for(int i = 0; i < 11; i ++){
            System.out.println("\t" + i + "\t|\t" + Math.round(Math.pow(i, 2)) + "\t|\t" + Math.round(Math.pow(i,3)) + "\t|");
        }

    }
}
