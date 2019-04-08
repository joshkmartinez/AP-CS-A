public class SpaceCraft implements Comparable {
    private int weight; //in kg
    private double length; //in meters
    private int capacity;
    private int engines;
    public SpaceCraft(int w, double l, int c, int e){
        weight = w;
        length = l;
        capacity = c;
        engines =  e;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public double getlength(){
        return length;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public int getEngines(){
        return engines;
    }
    
    public String toString(){
        return capacity + " " + weight + " " + length;
    }
    
    public int compareTo(Object o){
        SpaceCraft s = (SpaceCraft)o;
        if(capacity==s.getCapacity()&&(weight/engines)==s.getWeight()/s.getEngines()){
            return 0;
        }
        return 1;
    }
}