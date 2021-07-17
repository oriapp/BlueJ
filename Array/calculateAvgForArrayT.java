import java.util.*;
public class calculateAvgForArrayT
/*
 * Test of something, you can ignore.
 */
{
    public static void mian(String args[]){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[12];
        
        for(int i = 0; i < arr.length; i++){
            int line = scanner.nextInt();
            arr[i] = line;
        }
        
        System.out.println(Arrays.stream(arr).sum() / arr.length);
    }
}