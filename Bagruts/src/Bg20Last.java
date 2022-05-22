public class Bg20Last {
    // קיץ תש"ף
    public static int above(int[] arr, int num) {
        // שאלה 1
        // נכון ללא עזר
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
            if (sum > num)
                return i;
        }
        return -1;
    }


    class Weight {
        private int kilo; // from 0 to unlimited;
        private int gram; // from 0 to 999 (including);
        private Weight[] arr;


        // imagine there are already getters and setters

        // ממש את שני הפעולות הבונות של מחלקה הנ"ל
        // public Weight(int kilo, int gram)
        // and
        // public Weight(int totalGram)

        public Weight(int kilo, int gram) {
            this.kilo = kilo;
            this.gram = gram;
        }

        public Weight(int totalGram) {
            this.kilo = totalGram/1000;
            this.gram = totalGram%1000;
        }

        public Weight() {

        }


        // שאלה 2 סעיף ב
        // ממש את הפעולות add ו less

        public void add (Weight other) {
            int gr = this.gram + other.gram;
            this.gram = gr % 1000;
            this.kilo = other.kilo + gr % 1000;

            // or

            if (this.gram + other.gram > 1000) {
                this.kilo = other.kilo + 1;
                this.gram = (this.gram + other.gram) % 1000;
            } else {
                this.kilo = other.kilo;
                this.gram = other.gram;
            }
        }

        public boolean less(Weight other) {
//            if ((this.kilo + this.gram) < (other.kilo + other.gram)) {
//                return true;
//            } else {
//                return false;
//            }
            // OR

            if (this.kilo < other.kilo) {
                return true;
            }else if (this.kilo == other.kilo && this.gram < other.gram) {
                return true;
            }

            return false;
        }


        // שאלה 2 סעיף ג
        // ממש את הפעולה sum

        public Weight sum() {
            Weight w = new Weight();

            for (int i = 0; i < this.arr.length; i++) {
                w.add(this.arr[i]);
            }
            return w;
        }


    }

    public static void main(String[] args) {
        int[] x = {3, -2, 6, 2, 1, 3};
        System.out.println(above(x, 9));
    }
}
