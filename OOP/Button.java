public class Button
/*
 * practice page number 3
 * 
 * Question 1
 * 
 * "A simple climb"
 */
{
    private int num;
    private int size;
    private String color;
    private double price;
    
    public Button(int num, int size, String color, double price){
        this.num = num;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    
    public Button(int size, String color, int price){
        this.num = num;
        this.size = 5;
        this.color = "black";
        this.price = 2;
    }
    
    // getter
    
    public int getSize(){
        return this.size;
    }
    
    public boolean aboveMax(int max){
        return this.price > max;
    }
    
    public boolean bestOne(int maxWidth, int maxPrice){
        return this.size > maxWidth && this.price > maxPrice;
    }
    
    // setter
    
    public void incPrice(){
        if(this.price > 4 && this.color == "red") this.price += 5;
    }
}
