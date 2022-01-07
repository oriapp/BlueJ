public class searchNumberInWholeNumber
{
    public static boolean search(int num, int dig) {
        // stop statement
        if (num == 0)
            return false;
        // check if last number equals to dig
        if (num % 10 == dig)
            return true;

        return search(num/10, dig);
    }

    public static void main(String args[]) {
        System.out.println(search(1542, 3)); // return false
    }
}
