
public class Drills1_No11 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        int z = y;

        System.out.println("The original values are x = " + x + " and y = " + y);

        y = x;
        x = z;

        System.out.println("The exchanged values are x = " + x + " and y = " + y);


        
    }
}
