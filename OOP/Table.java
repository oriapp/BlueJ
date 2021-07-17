import java.util.*;
public class Table
{
    Scanner scanner = new Scanner(System.in);
    private double hight;
    private String color;
    private int length;
    private int width;
    
    public Table(double hight, String color, int length, int width){
        this.hight = hight;
        this.color = color;
        this.length = length;
        this.width = width;
    }
    
    public Table(double hight, int width){
        this.hight = 1.20;
        this.color = "black";
        this.length = length;
        this.width = width;
    }
    
    public void setHight(double hight){
        this.hight = hight;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    // getters
    
    public double getHight(){
        return this.hight;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public String toString(){
        return "high: " + this.hight + " color: " + this.color + " length: " + this.length + " width: " + this.width;
    }
    
    public double tableSize(){
        return  this.hight * this.length * this.width;
    }
    
    public String isRightColor(){
        String line = scanner.nextLine();
        String valid = "false";
        if(line == this.color){
            valid =  "true";
        }
        return valid;
    }
    
    public boolean higher(){
        double line = scanner.nextDouble();
        boolean valid = false;
        
        if(line < this.hight){
            valid = true;
        }
        
        return valid;
    }
    
}
