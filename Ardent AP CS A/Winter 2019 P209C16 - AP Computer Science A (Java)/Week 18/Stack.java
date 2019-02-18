import java.util.ArrayList;
public class Stack{
    //Stack ADT
    private ArrayList<Object> data;
    
    public Stack(){
        data=new ArrayList<Object>();
    }
    
    public int size(){
        return data.size();
    }
    
    public void add(Object o){
        data.add(o);
    }
    
    public Object top(){
        if (data.size()<1){return null;}
        return data.get(data.size()-1);
    }
    
    public Object pop(){
        if (data.size()<1){return null;}
        Object temp = data.get(data.size()-1);
        data.remove(data.size()-1);
        return temp;
    }
    
    public String toString(){
        String a = "";
        for(Object o : data){
            a+=o+"\n";
        }
        return a;
    }
}