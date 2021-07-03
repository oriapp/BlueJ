import java.util.*;
public class including
/*
 * Write a program that will take from the user string and special char and if the string includes and char return the string
 * otherwise reutnr the string + special char
 */
{
    static public void main(String args[]){
        Boolean includes = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type String: ");
        String x = scanner.nextLine();
        System.out.println("Type char: ");
        String y = scanner.nextLine();
        if (x.contains(y)){
            includes = true;
            System.out.println(x);
        } else {
            System.out.println(x + y);
        }
    }
}
