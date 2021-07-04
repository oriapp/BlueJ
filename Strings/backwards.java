import java.util.*;
public class backwards
/*
 * practice no. 9
 * Write a program that will take an input from the user and print it backwards (;
 */
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
