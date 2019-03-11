public class Person {
    private boolean infected;
    private double chance; //0 - immune & 1.0 non-immune
    
    public Person(){
        infected=false;
        chance=0.5;
    }
    
    public Person(double c){
        chance=c;
    }
    
    public boolean getInfected(){
        return infected;
    }
    
    public double getChance(){
        return chance;
    }
    
    public void changeChance(double d){
        chance = d;
    }
    
    public void changeInfected(boolean b){
        infected = b;
    }
    
    public String toString(){
        String a = "";
        a+="Infected: " + infected + "\n";
        a+="Chance of infection: " + chance;
        return a;
    }
}