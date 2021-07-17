import java.util.*;
public class compareEvenToOdd
/*
 * TASK NUMBER: 8
 * For an array with 20 elements
 * Write a program that will prints if the values from the even elements are equals to the values from odd elements
 */
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int arr[] = {1,2,5,6,3,2};
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                even += arr[i];
            }
            
            if (i % 2 != 0){
                odd += arr[i];
            }
        }
        
        if (even == odd){
            System.out.println("Even equals to Odd!");
        } else {
            System.out.println("Even does not equals to Odd!");
        }
        
        System.out.println(even + " " + odd);
    }
}
