import java.util.ArrayList;
public class Queue{
    private ArrayList<Object> q;
    
    public Queue(){
        q = new ArrayList<Object>();
    }
    
    public void enqueue(Object o){
        q.add(o);
    }
    
    public void dequeue(){
        q.remove(0);
    }
    
    public Object first(){
        return q.get(0);
    }
    
    public Object last(){
        return q.get(q.size()-1);
    }
    
    public String toString(){
        String a ="";
        
        for(Object o : q){
            a+=o+"\n";
            
        }
        return a;
    }
}