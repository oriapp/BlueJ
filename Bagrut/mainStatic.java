import java.util.Date;

public class mainStatic {
    protected Date date = new Date();

    public static void main(String[] args) {
        mainStatic date = new mainStatic();
        Date dx = date.getDate();
        System.out.println(dx);
    }

    public Date getDate(){
        return this.date;
    }
}
