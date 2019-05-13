import java.util.ArrayList;
public class Main {
    public static String encrypt(String s ){
        ArrayList<String> e = new ArrayList<String>();
        for(int i = 0; i<s.length(); i++){
            e.add(Character.toString(s.charAt(i)));
        }
        int offset = 369;
        int mult = 9;
        String a = "";
        for(int i = 0; i<e.size(); i++){
            int code = (int)e.get(i).charAt(0);
            code = code + offset - (i*mult);
            a+=Character.toString((char)code);
        }
        
        return a;
    }
    
    // no i shift
    public static String encryptBad(String s ){
        ArrayList<String> e = new ArrayList<String>();
        for(int i = 0; i<s.length(); i++){
            e.add(Character.toString(s.charAt(i)));
        }
        int offset = 369;
        //int mult = 9;
        String a = "";
        for(int i = 0; i<e.size(); i++){
            int code = (int)e.get(i).charAt(0);
            code = code + offset;
            a+=Character.toString((char)code);
        }
        
        return a;
    }
    
    public static String decrypt(String s ){
        ArrayList<String> e = new ArrayList<String>();
        for(int i = 0; i<s.length(); i++){
            e.add(Character.toString(s.charAt(i)));
        }
        int offset = 369;
        int mult = 9;
        String a = "";
        for(int i = 0; i<e.size(); i++){
            int code = (int)e.get(i).charAt(0);
            code = code - offset + (i*mult);
            a+=Character.toString((char)code);
        }
        
        return a;
    }

    public static void main (String[] args){
        String a = encrypt("https://congrats.now.sh");
        System.out.println(encrypt("https://congrats.now.sh"));
        System.out.println(decrypt(a));
    }
}