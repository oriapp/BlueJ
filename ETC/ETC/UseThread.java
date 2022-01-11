public class UseThread extends Thread {
    
    @Override
    public void run()
    {
        for(int i=1; i<=5; i++) {
            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException error){
                System.out.println("Something went wrong " + error);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        UseThread thread1=new UseThread();
        UseThread thread2=new UseThread();
        thread1.start();
        thread2.start();
    }

}
