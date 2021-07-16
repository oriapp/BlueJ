import java.util.*;
public class runners
/*
 * Write a program that will get fromt the user 10 doubles and print the lowest
 */
{
    static public void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int totalRunners = 5;
        double runner[] = new double[totalRunners];
        
        for(int i = 0; i < totalRunners; i++){
            double score = scanner.nextInt();
            runner[i] = score;
        }
        
        // Arrays.stream(runner).min().getAsDouble()
        
        System.out.println("In the 1th place " + Arrays.stream(runner).min().getAsDouble());
    }
}
