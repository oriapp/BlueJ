import java.util.Scanner;

public class Matconet22Rotberg {

    static class Dancer {
        private String name;
        private double price;
        private boolean isClassic;

        public Dancer(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public boolean inPrice(int max, int num) {
            if ((max * num) < this.price) {
                return true;
            }
            return false;
            // or
            // return (max * num) < this.price
        }

        public static void isInPrice(Dancer[] x) {
            int n;
            double b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter budget: ");
            b = sc.nextDouble();
            while(b >= 0) {
                System.out.println("Enter number of shows: ");
                n = sc.nextInt();
                for (int i = 0; i < x.length; i++) {
                    if (x[i].inPrice((int) b, n)) {
                        System.out.println(x[i].getName() + " ");
                    }
                    System.out.println("Enter budget: ");
                    b = sc.nextDouble();
                }
            }
        }
    }

    public static void main(String[] args) {
        Dancer x = new Dancer("ori", 20);
        Dancer[] y = {x};
        x.isInPrice(y);
    }
}
