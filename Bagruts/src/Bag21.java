import java.util.Arrays;

public class Bag21 {

    class Subject {
        private String subName;
        private int grade;
    }

    class ReportCard {
        private String stuName;
        private Subject[] subArray;

        public ReportCard(String name, int num) {
            // שאלה 2 א
            this.stuName = name;
            this.subArray = new Subject[num];
        }

    public int[] filter(int[] arr, int num) {
                int totalItems = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != num) totalItems++;
                }

                int[] newArr = new int[totalItems];

                int j = 0;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != num) {
                        newArr[j] = arr[i];
                        j++;
                    }
        }

        return newArr;
    }

//        public boolean isExcellent() {
//            // שאלה 2 סעיף ב
//
//            if (this.avrage() < 85) {
//                return false;
//            }
//
//            boolean grd100 = false;
//            int grd;
//            for (int i = 0; i < subArray.length; i++) {
//                grd = subArray[i].getGrade();
//                if (grd <= 54) {
//                    return false;
//                }
//                if (grd == 100) {
//                    grd100 =  true;
//                }
//            }
//            return grd100;
//        }


//        public void printExcellent(ReportCard[] array) {
//            // שאלה 2 סעיף ג
//            for (int i = 0; i < array.length; i++) {
//                if (array[i].isExcellent()){
//                    System.out.println(array[i].getStuName());
//                }
//            }
//        }

    }

    public static void main(String[] args) {
        int[] x = {6, 9, 2, 2, 9, 4, -3};
//        System.out.println(Arrays.toString(filter(x, 9)));
    }
}
