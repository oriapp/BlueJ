public class arrTen
/*
 * TASK NUMBER: 1
 * 
 * 
 * Write a program that will have an array with  10 elements and fill them up with numbers from 1 to 9
 */
{
    public static void main(String args[]){
        int[] numbers = new int[10];
        
        for (int i = 0; i < 10; i++){
            numbers[i] = i;
        }
        
        for (int i = 0; i < 10; i++){
            System.out.println(numbers[i]);
        }
    }
}
