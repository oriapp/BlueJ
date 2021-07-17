import java.util.*;
public class findExceptionsBetterVersion
/*
 * TASK NUMBER: 9
 * 
 * For an array named "arr" with 8 elements.
 * write a program that will check if each element equals the other elements in the array
 * and and return a match message/response for the results 9:
 */
{
    public static void main(String args[]){
        // String arr[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String arr[] = {"a", "a", "a", "a", "a", "a", "a", "a"};
        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        // int arr[] = {1, 1, 1, 1, 1, 1, 1, 1};
        boolean valid = true;
        
        // System.out.println(Arrays.stream(arr).sum() / 8);
        
        for(int i = 0; i < arr.length; i++){
            String x = arr[i];
            for (int y = 0; y < arr.length; y++){
                if(x != arr[y]){
                    valid = false;
                }
            }
        }
        
        System.out.println(valid);
    }
}
