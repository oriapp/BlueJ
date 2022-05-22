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

    public static void main(String[] args) {
        Stack<Integer> x = new Stack<>();
        x.push(162);
        x.push(251);
        x.push(568);
        x.push(77);
        System.out.print("Original from -> ");
        System.out.println(x);
        System.out.println(isExist(8 , x));
    }
}
