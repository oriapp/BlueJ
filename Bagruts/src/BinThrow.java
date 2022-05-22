import unit4.collectionsLib.*;

public class BinThrow {

    public static int allPos (BinNode <Integer> t)
    {
        if(t==null)
            return 0;
        int n=0;
        if(t.getValue()>0)
            n=t.getValue();
        return  n + allPos (t.getLeft()) + allPos (t.getRight());
    }


    public static void main(String[] args) {
        BinNode <Integer>x1 = new BinNode(1);
        BinNode <Integer>x2 = new BinNode(2);
        BinNode <Integer>x3 = new BinNode(3);

        x1.setLeft(x2);
        x1.setRight(x3);

        System.out.println(allPos(x1));
    }
}
