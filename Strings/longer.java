import java.util.*;
public class longer
/*
 * This program needs to take two inputs from the user and print the longest.
 */
{
    static public void main(String args[]){
        Scanner x = new Scanner(System.in);
        
        String a = x.nextLine();
        String b = x.nextLine();
        
        if (a.length() < b.length()){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
