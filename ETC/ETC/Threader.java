  
/**
 * Write a description of class Threader here.
 *
 * @author (Ori Appelbaum)
 * @version (1.0.0 1/11/2022 GMT +2)
 */
public class Threader extends ThreaderTest
{
    public static void main(String args[]) {
        
        for (int i = 0; i <= 5; i++) {
            MultiThreading multi = new MultiThreading(i);
            Thread multis = new Thread(multi);
            multis.start();
            System.out.println("Loop working " + i);
        }
        
    }
}
