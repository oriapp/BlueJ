import java.util.*;
public class printBackwards
/*
 * TASK NUMBER: 3
 * 
 * Write a program that will take 10 inputs from the user
 * and print them backwards
 */
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
