import java.util.*;
public class numEqToString
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String len = scan.nextLine();
        
        if(str.length() >= Integer.parseInt(len)){
            System.out.println(str.substring(0, Integer.parseInt(len)));
        } else {
            System.out.println(str.substring(0, Integer.parseInt(len) + 1));
        }
    }
}
