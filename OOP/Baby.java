public class Baby
/*
 * practice page number 3
 * 
 * Question 2
 * 
 * The baby
 */
{
    private String id;
    private char gender;
    private double height;
    private double weight;
    
    public Baby(String id, char gender, double height, double weight){
       this.id = id;
       this.gender = gender;
       this.height = height;
       this.weight = weight;
    }
    
    public Baby(String id, double height, double weight){
        this.id = id;
        this.gender = 'f';
        this.height = height;
        this.weight = weight;
    }
    
    // getters
    
    public double getHeight(){
        return this.height;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public boolean aboveAvg(double avg){
        return this.height > avg;
    }
    
    public boolean boyAboveAvg(double avg){
        return this.gender == 'm' && this.height > avg;
    }
    
    // setters
    
    public void addHeight(double w){
        this.height += w;
    }
    
    public void addWeight(double h){
        this.weight += h;
    }
}
