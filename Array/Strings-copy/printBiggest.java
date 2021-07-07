import java.util.*;
public class printBiggest
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
