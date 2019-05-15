//2016 Question 2
public class LogMessage{
    private String machineId;
    private String description;
    
    public LogMessage(String m){
        int i = m.indexOf(":");
        machineId = m.substring(0,i);
        description = m.substring(i+1);
    }
    
    public boolean containsWord(String s){
        int i = description.indexOf(s);
        if(i==-1){
            return false;
        }
        //do
        if(i==0 || (!(i==description.length()-s.length())&&description.charAt(i+1) == ' ')){
            return true;
        }
        if(i==0 || (!(i==description.length()-s.length())&&description.charAt(i+1) == ' ')){
            return true;
        }
        return false;
    }
    
    
}