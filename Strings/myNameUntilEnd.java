import java.util.*;
public class myNameUntilEnd
{
    static public void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int total = 0;
        while (!line.equals("end")){
            if(myNameUntilEnd(line)){
                total++;
            }
            line = scanner.nextLine();
        }
        System.out.println(total);
    }
    
    
    static Boolean myNameUntilEnd(String x){
        boolean valid = false;
        
        if (x.endsWith(x.substring(0, 1))){
            valid = true;
        }
        
        return valid;
    }
}
