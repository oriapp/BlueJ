public class questionOneFilterFromArray {
    static public void main(String args[]){
        int[] res = Filter(new int[]{6, 9, 2, 2, 9, 4, -3}, 9);
        for (int i : res){
            System.out.println(i);
        }
    }

    public static int[] Filter(int[] arr, int num){
        int n = countNums(arr, num);
        int[] a = new int[n];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != num){
                a[j] = arr[i];
                j++;
            }
        }
        return a;
    }

    public static int countNums(int[] arr, int num){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != num){
                count++;
            }
        }
        return count;
    }
}
