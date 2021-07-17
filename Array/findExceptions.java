import java.util.*;
public class findExceptions
/*
 * TASK NUMBER: 9 (You can ignore this one and take a look at findExceptionsBNetterVersion)
 * 
 * For an array with 8 elements
 * write a program that will check if all the other elements are equals to each other
 */
{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        // int arr[] = {1, 1, 1, 1, 1, 1, 1, 1};
        
        if (Arrays.stream(arr).sum() / arr.length == 1){
            System.out.println("Equals!");
        } else {
            System.out.println("Nope");
        }
    }
}
