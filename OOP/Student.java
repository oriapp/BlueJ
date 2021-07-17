
public class Student
{
    private String name;
    private int ID;
    private int yearOfBirth;
    private int phone;
    private int scoreA;
    private int scoreB;
    private int scoreYearly;
    
    public Student(String name, int ID, int yearOfBirth, int phone, int scoreA, int scoreB, int scoreYearly){
        this.name = name;
        this.ID = ID;
        this.yearOfBirth = yearOfBirth;
        this.phone = phone;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
        this.scoreYearly = scoreYearly;
    }
    
    public Student(String name, int ID, int phone){
        this.name = name;
        this.ID = ID;
        this.phone = phone;
        this.scoreA = 0;
        this.scoreB = 0;
        this.scoreYearly = 0;
    }
    
    // setters
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    
    public void setPhone(int phone){
        this.phone = phone;
    }
    
    public void setScoreA(int scoreA){
        this.scoreA = scoreA;
    }
    
    public void setScoreB(int scoreB){
        this.scoreB = scoreB;
    }
    
    public void setScoreYearly(int scoreYearly){
        this.scoreYearly = scoreYearly;
    }
    
    // getters
    
    public String getName(){
        return this.name;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public int getYearOfBirth(){
        return this.yearOfBirth;
    }
    
    public int getPhone(){
        return this.phone;
    }
    
    public int getScoreA(){
        return this.scoreA;
    }
    
    public int getScoreB(){
        return this.scoreB;
    }
    
    public int getScoreYearly(){
        return this.scoreYearly;
    }
    
    // toString
    
    public String toString(){
        String x = "name : " + this.name + "ID: " + this.ID + "Year Of Birth: " + this.yearOfBirth + "phone: " + this.phone + "Score A: " + this.scoreA
        + "Score B: " + this.scoreB + "Score Yearly: " + this.scoreYearly;
        
        return x;
    }
    
    // avg setter
    public void setYearly(int scoreYearly){
        this.scoreYearly = this.scoreA + this.scoreB / 2;
    }
    
    public boolean goodStudent(){
        if (this.scoreYearly >= 90){
            return true;
        } else {
            return false;
        }
    }
}
