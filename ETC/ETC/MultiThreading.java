
/**
 * Write a description of class MultiThreading here.
 *
 * @author (Ori Appelbaum)
 * @version (1.0.0 1/11/2022 GMT +2)
 */
public class MultiThreading extends Thread
{
    // Thread idnifier number
    private int threadNumber;

    public MultiThreading (int threadNumber) {
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run() {
        for (int i = 1; 1 <= 5; i++) {
            System.out.println(i + " form " + threadNumber); 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException error) {
                System.out.println("Something went wrong " + error);
            }
        }
    }
}
