import java.util.*;
public class printBackwards
{
    static public void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[10];
        
        for (int i = 0; i < 10; i++){
            int input = scanner.nextInt();
            number[i] = input;
        }
        System.out.println(number.length);
        for (int i = number.length; i < 0; i--){
            System.out.println("In");
            System.out.print(number[i] + " ");
        }
    }
}
