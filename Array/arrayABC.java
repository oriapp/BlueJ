public class arrayABC
/*
 * TASK NUMBER: 10
 */
{
    static public void main(String args[]){
    int a[] = {10, 20, 100, 30};
    int b[] = {20, 40, 90, 70};
    int c[] = new int[4];
        for(int i = 0; i < c.length; i++){
            c[i] = a[i] + b[i];
        }
        
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
}
