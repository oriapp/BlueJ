import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] x = new int[4];
        for (int i = 0; i < 3; i++) {
            x[i] = i+1;
        }
        System.out.println(Arrays.stream(x).max());
    }
}
