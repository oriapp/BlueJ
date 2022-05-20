import java.util.Arrays;
import java.util.OptionalDouble;

public class Streams {
        public static double returnAvg1(int one, int two, int three, int four, int five) {
            return (one + two + three + four + five) / 5.0;
        }
        // פעולה חיצונית שתקבל חמישה מספרים ותחזר ממוצע ביניהם
        public static OptionalDouble returnAvg2(int[] nums) {
            return Arrays.stream(nums).average();
        }

        public static void main(String[] args) {
                int[] x = {1, 2, 3, 4, 5};
            System.out.println(returnAvg2(x).getAsDouble()  );
        }
}