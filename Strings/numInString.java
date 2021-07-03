import java.util.*;
public class numInString
/*
 * This program take an input from the user and reutns 
 * True is there are no numbers in the string.
 * False If there are numbers in the string.
 */
{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        
        String inp = x.nextLine();
        
        boolean hasDigit = false;
        
        for (int i = 0; i < inp.length(); i++){
            if(!Character.isDigit(inp.charAt(i))){
               hasDigit = true; 
            }
        }
        System.out.println(hasDigit);
    }
}
