import java.util.*;
public class printBiggest
/*
 * TASK NUMBER: 5
 * 
 * Write a program that will take 8 inputs fromt the user and print the biggest number
 */
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[8],
        max;
        
        for(int i = 0; i  < arr.length; i++){
            int input = scanner.nextInt();
            arr[i] = input;
        }
        
        System.out.println(Arrays.stream(arr));
        
        Arrays.stream(arr).reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
    }
}
