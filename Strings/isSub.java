import java.util.*;
public class isSub
/*
 * practice no.8
 * Write a program that will take two inputs from the user (st1, st2)
 * And check if st1 contains st2
 * if TRUE return true
 * otherwise return false
 */
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st1 = scan.nextLine();
        String st2 = scan.nextLine();
        
        if(st1.toLowerCase().contains(st2.toLowerCase())){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
