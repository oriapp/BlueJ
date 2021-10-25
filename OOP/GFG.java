   import java.io.*; 
class GFG {
 
    // Function to find the count of
    // digits in N
    static int numberOfDigit(int N)
    {
 
        // Stores count of
        // digits in N
        int digit = 0;
 
        // Calculate the count
        // of digits in N
        while (N > 0) {
 
            // Update digit
            digit++;
 
            // Update N
            N /= 10;
        }
        return digit;
    }
 
    // Function to rotate the digits of N by K
    static void rotateNumberByK(int N, int K)
    {
 
        // Stores count of digits in N
        int X = numberOfDigit(N);
 
        // Update K so that only need to
        // handle left rotation
        K = ((K % X) + X) % X;
 
        // Stores first K digits of N
        int left_no = N / (int)(Math.pow(10,
                                         X - K));
 
        // Remove first K digits of N
        N = N % (int)(Math.pow(10, X - K));
 
        // Stores count of digits in left_no
        int left_digit = numberOfDigit(left_no);
 
        // Append left_no to the right of
        // digits of N
        N = (N * (int)(Math.pow(10, left_digit)))
            + left_no;
 
        System.out.println(N);
    }
 
    // Driver Code
    public static void main(String args[])
    {
 
        int N = 12345, K = 7;
 
        // Function Call
        rotateNumberByK(N, K);
    }
}