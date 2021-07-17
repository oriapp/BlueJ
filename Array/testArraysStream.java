import java.util.*;
public class testArraysStream
{
    public static void mian(String args[]){
        Scanner scanner = new Scanner(System.in);
        String arr[] = new String[4];
        
        for(int i = 0; i < arr.length; i++){
            String line = scanner.nextLine();
            arr[i] = line;
        }
        
        // System.out.println(Arrays.stream(arr).sum());
    }
}
