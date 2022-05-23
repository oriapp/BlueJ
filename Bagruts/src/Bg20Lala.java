import unit4.collectionsLib.*;


public class Bg20Lala {

    public static boolean isExist(int num, Stack<Integer> stk) {
        // הפעולה מקבל שני ערכים
        // num (int) ו stk (Stack<Integer>)
        // הפעולה מחזירה אמת במידה ונמצא אמת במידה ונמצא תא המסתיים בספרה num.
        // אחרת הוא מחזיר שקר

        // !! יש לשמור על מבנה המחסנים בסוף הפעולה !!
        boolean found = false;
        Stack<Integer> newStack = new Stack<>();
            while(!stk.isEmpty()) {
                int theNum = stk.top();
                if ((theNum % 10) == num) {
                    found =  true;
                }
                newStack.push(stk.pop());
            }

        while(!newStack.isEmpty()) {
            stk.push(newStack.pop());
        }
        System.out.print("New form (should be the same) -> ");
        System.out.println(stk);
        return found;
    }

    public static String allExist(Stack<Integer> stk) {
        Stack<Integer> ns = new Stack<>();
        String hasNum = "true";
        int totalNums = 0;
        while (!stk.isEmpty()) {
            int popedNum = stk.pop();
            totalNums++;
            ns.push(popedNum);
        }
        int[] hunNums = new int[totalNums];
        int[] sinNums = new int[totalNums];
        int count = 0;
        while(!ns.isEmpty()) {
            int theNumber = ns.pop();
            stk.push(theNumber);
            hunNums[count] = theNumber / 100;
            sinNums[count] = theNumber % 10;
            count++;
        }

        for (int i = 0; i < hunNums.length; i++) {
            for (int j = 0; j < sinNums.length; j++) {
                if (hunNums[i] != sinNums[j] || 0 ==  sinNums[j])
                    hasNum = "false";
            }
        }

        return hasNum;
    }

    public static void main(String[] args) {
//        Stack<Integer> x = new Stack<>();
//        x.push(162);
//        x.push(251);
//        x.push(568);
//        x.push(77);
//        System.out.print("Original form -> ");
//        System.out.println(x);
//        System.out.println(isExist(8 , x));

        Stack<Integer> x = new Stack<>();
        x.push(122);
        x.push(251);
        x.push(565);
        x.push(12334);
        x.push(28);
        x.push(7);
        System.out.println(allExist(x));
    }
}
