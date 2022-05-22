import unit4.collectionsLib.*;

public class Pen {
    private String color;
    private String made;
    private double price;
    private double weight;

    // פעולה בונה שמחזירה את הנתונים הנ"ל
    public Pen(String made) {
        this.color = "red";
        this.made = made;
        this.price = 10.0;
        this.weight = 25.0;
    }

    // פעולה בונה המחזירה את הפרמטרים
    public Pen(String color, String made, double price, double weight) {
        this.color = color;
        this.made = made;
        this.price = price;
        this.weight = weight;
    }

    public String getMade() {
        return this.made;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {

    }
}
