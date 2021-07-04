import java.util.*;
public class hasChar
{
    static public void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String chr = scan.nextLine();
        boolean hasChar = false;
        
        for(int i = 0; i < str.length(); i++){
            if(str.substring(0, i) == chr){
                System.out.println("in" + i);
                hasChar = true;
            }
        }
        System.out.println(hasChar);
    }
}
