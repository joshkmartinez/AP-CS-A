//2017 FRQ 3B

public class Phrase{
    private String p;
    
    public Phrase(String i){
        p=i;
    }
    
    //find last occurence
    public int findLast(String i){
        int index = p.indexOf(i);
        if(index==-1){
            return -1;
        }
        
        String s = p.substring(index+i.length());
        return -1;
    }
}