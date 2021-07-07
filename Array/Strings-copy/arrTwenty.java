import java.util.*;
public class arrTwenty
/*
 * Count how many int's are equals to the last element in the array
 */
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int runXTimes = 20;
        int[] numbers = new int[runXTimes];
        int totalEqual = 0;
        
        for (int i = 0; i < runXTimes; i++){
            int inp = scanner.nextInt();
            numbers[i] = inp;
        }
        
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == numbers[numbers.length - 1]){
                totalEqual++;
            }
        }
        System.out.println("Found " + totalEqual);
    }
}
