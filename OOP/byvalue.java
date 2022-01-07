
public class byvalue
{
    // This is an  example of by value. you send it the value and not the memory location. 
    // I'll show an example of by reference when you send it the location in memory of the array or objet, and once you change one of the items number It'll change it for all the function. unlike here when i changes the value only for the same function (and creates new memory location)
    public static void byValue(int x){
        x++;
    }
    public static void main(String[] args){
        int x = 7;
        byValue(x); // by value
        
        int []arr = {1, 2, 3};
        byReference(arr);
        
        System.out.println(arr[0]);
        
        System.out.println(x);
    }
    
    
    public static void byReference(int []a){
        a[0]++; // this line will go into the arr (original) memory location and change it for all the locations. see the first echo
    }
}
