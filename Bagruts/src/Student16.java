public class Student16 {
    private String name;
    private int year;
    // השלם את הבאני של תלמיד
    public Student16(String name, int year) {
        this.name = name;
        this.year = year;
    }
}

class Main {
    // יצור שני עצמים בעלי שם שונה ושנת לידה דומה
    public static void main(String[] args) {
        Student16 st1 = new Student16("ori", 2003);
        Student16 st2 = new Student16("nir", 2003);
    }
}