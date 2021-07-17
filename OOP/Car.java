
public class Car
{
    private String carId;
    private String name;
    private boolean auto;
    private double price;
    private boolean isOk;
    
    public Car(String carId, String name, boolean auto, double price, boolean isOk){
        this.carId = carId;
        this.name = name;
        this.auto = auto;
        this.price = price;
        this.isOk = isOk;
    }
    
    public Car(String carId, String name, boolean auto, boolean isOk){
        this.carId = carId;
        this.name = name;
        this.auto = auto;
        this.price = 1000;
        this.isOk = isOk;
    }
    
    public void setCarId(String carId){
        this.carId = carId;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAuto(boolean auto){
        this.auto = auto;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setIsOk(boolean isOk){
        this.isOk = isOk;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCarId(){
        return this.carId;
    }
    
    public String toString(){
        return "car id: " + this.carId + "name: "+ this.name + "is automatic? " + this.auto + "price: " + this.price + "fix? " + this.isOk;
    }
}