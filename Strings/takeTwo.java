import java.util.*;
public class takeTwo
{
    public static void main(String args[]){
        /*
         * Takes two inputs from the user and build a new string by taking two of the first chars in each input
         */
        Scanner x = new Scanner(System.in);
        String in_1 = x.nextLine();
        System.out.print(in_1.substring(0, 2) + in_1.substring(0, in_1.length() - 2));
    }
}
