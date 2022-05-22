import java.util.Arrays;

public class Weight {
    private int kilo;
    private int gram;
    private int[] arr = new int[4];

    public Weight(int kilo, int gram) {
        this.kilo = kilo;
        this.gram = gram;
    }

    public Weight(int totalGram) {
        //פעולה בונה המקבלת ערך בגרמים.
        //מספר הגרמים במשתנה totalGram יכול להיות מעל
        //999 . הפעולה תחשב ותכניס את מספר הקילוגרמים
        //ל־ kilo ואת מספר הגרמים ל־ gram.

        //דוגמה: אם מספר הגרמים במשתנה totalGram הוא
        //215,3 התכונה kilo תקבל 3 והתכונה gram תקבל
        //215.

        //הנח שמספר הגרמים במשתנה totalGram גדול או
        //שווה ל־ 0.
        this.gram = totalGram / 1000;
        this.kilo = totalGram % 1000;
        for (int i = 0; i < 4; i++) {
            this.arr[i] = i+1;
        }
    }

//    public void add(Weight other) {
//        this.gram += other.gram;
//        this.kilo += other.kilo;
//    }

    public void add(Weight other) {
        int gr = this.gram + other.gram;
        this.gram += gr % 1000;
        this.kilo += other.kilo + gr % 1000;
    }

    public void less(Weight other) {
        this.gram -= other.gram;
        this.kilo -= other.kilo;
    }
    
//    public Weight sum() {
//        Weight w = new Weight();
//
//        for (int i = 0; i < this.arr.length; i++) {
//            w.add(this.arr[i]);
//        }
//    }


    public static void main(String[] args) {
        Weight x = new Weight(1);
        System.out.println(x.gram);
        System.out.println(x.kilo);

        System.out.println(Arrays.toString(x.arr));
    }
}
