import java.util.*;
public class numStringCount
{
    public static void main(String args[]){
        numInString();
    }
    
    static int numInString(){
        Scanner x = new Scanner(System.in);
        int total = 0;
        int num = 0;
        
        while(num >= 20){
            num--;
            String inp = x.nextLine();
            try{
                Integer.parseInt(inp);
                System.out.println("Yes");
            } catch (NumberFormatException e){
                total++;
            }
        }
        
        return total;
    }
}
