public class myName
{
    static public void main(String args[]){
        System.out.println(myName("OriO"));
    }
    
    
    static Boolean myName(String x){
        boolean valid = false;
        
        if (x.endsWith(x.substring(0, 1))){
            valid = true;
        }
        
        return valid;
    }
}
