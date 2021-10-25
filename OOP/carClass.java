
public class carClass
{
    public class Car extends carClass{
        private String model;
        private String color;
        private int year;
        private boolean automatic;
        private int price;
        
        //public Car(String model, String color, int year, boolean automatic, int price){
        //    this.model = model;
        //    this.color = color;
        //    this.year = year;
        //    this.automatic = automatic;
        //    this.price = price;
        //}
        
        public void setModel(String model){
            this.model = model;
        }
        
        public void setColor(String color){
            this.color = color;
        }
        
        public void setYear(int year){
            this.year = year;
        }
        
        public void setAutomatic(boolean automatic){
            this.automatic = automatic;
        }
        
        public void setPrice(int price){
            this.price = price;
        }
        
        
        // getter
        public String getModel(){
            return this.model;
        }
        
        public String getColor(){
            return this.color;
        }
        
        public int getYear(){
            return this.year;
        }
        
        public boolean getAutomatic(){
            return this.automatic;
        }
        
        public int getPrice(){
            return this.price;
        }
        
        
        
        public String toString(){
            return "Model:  " + this.model +  
            " *** color: " + this.color +
            " *** year: " + this.year +
            " *** automatic= " + this.automatic +
            "****** total price :  " + this.price;
        }
        
        public Car(String model, String color, int year, boolean automatic, int price){
            this.model = "volvo";
            this.color = color;
            this.year = 2012;
            this.automatic = automatic;
            this.price = price;
        }
    }
    
    public static void main(String args[]) throws Exception{
        // Car myObj = new Car();
        
    }
}
