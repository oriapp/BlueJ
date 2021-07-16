import java.util.*;
public class findExceptions
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
