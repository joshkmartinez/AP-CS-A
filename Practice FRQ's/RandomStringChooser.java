//2016 Question 1
import java.util.ArrayList;
//part a
public class RandomStringChooser{
    private ArrayList<String> arr;

    public RandomStringChooser(String[] s){
        arr=new ArrayList<String>();
        for (String i:s){
            arr.add(i);
        }
    }

    public String getNext(){
        int i = (int)(Math.random()*arr.size());
        if(arr.size()==0){
            return "NONE";
        }
        String s = arr.get(i);
        arr.remove(i);
        return s;
    }
}
