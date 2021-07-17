import java.util.*;
public class calculateAvgForArray
/*
 * TASK NUMBER: 7
 * 
 * For an array named "arr" with 12 elements
 * write a program that will calculate the avg
 * and returns how many elements from the array are equals to the avg
 */
{
    public static void mian(String args[]){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[12];
        int total = 0;
        
        for(int i = 0; i < arr.length; i++){
            int line = scanner.nextInt();
            arr[i] = line;
        }
        
        int sum = Arrays.stream(arr).sum() / arr.length;
        
        for(int x = 0; x < arr.length; x++){
            if (arr[x] == sum){
                total++;
            }
        }
        System.out.println(total);
    }
}