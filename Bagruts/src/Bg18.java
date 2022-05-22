import unit4.collectionsLib.*;

public class Bg18 {
    static class AllNumbers {
        private int[] arrayNum = {7, 5, 8, 9, 3, 4};
        private int lastOdd;

        public int lastOddValue() {
            // הפעולה מחזירה את המספר האחרון במערך שהוא אינו מספר זוגי
            // במקרה זה הפעולה תחזיר את הספרה 3 למערך הבא:
            // {7, 5, 8, 9, 3, 4}
            for (int i = 0; i < arrayNum.length; i++) {
                if (arrayNum[i]%2 != 0) {
                    lastOdd = arrayNum[i];
                }
            }
            return lastOdd;
        }


        public static int lastAndRemove(Stack<Integer> x) {
            // פרק שני שאלה 4 סעיף א

            int removedNum = x.pop();

            Stack<Integer> newStack = new Stack<>();
            while(!x.isEmpty()) {
                newStack.push(x.pop());
            }

            return removedNum;
        }

        public void TwoItem(int number1, int number2) {
            number1 = number2;
        }

        public static <TwoItem> Stack<TwoItem> StackTwoItem (Stack<Integer> stk) {
            Stack<TwoItem> s1 = new Stack<TwoItem>();
            int n1, n2;
            while(!stk.isEmpty()) {
//                s1.push(new TwoItem(stk.pop(), lastAndRemove(stk)));
            }
            return s1;
        }

        public static int[] TwoItems(Stack<Integer> x, Stack<Integer> y) {
            int[] xy = {1,2};
            return xy;
        }
    }

    static class Other {
        public static Node<Integer> delete(int num, Node<Integer> lst) {
            Node<Integer> x = new Node<Integer>(2, lst);
            while (x.hasNext()) {
                x.getNext();
            }
//            x.setNext(num);
            return x;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> x = new Stack<>();
        x.push(1);
        x.push(6);
        x.push(32);
        x.push(5);
        x.push(5);
        x.push(7);
        x.push(4);
        x.push(9);
        // System.out.println(AllNumbers.lastAndRemove(x));

        System.out.println(Other.delete(1, new Node<Integer>(1)));
    }
}