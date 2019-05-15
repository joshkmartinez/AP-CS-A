//2016 Question 1 part b
public class RandomLetterChooser extends RandomStringChooser{
    public RandomLetterChooser(String s){
        super(getSingleLetters(s));
    }
    
    //This method is not intended to be implemented.
    //It was created to test the contrucotr
    public static String[] getSingleLetters (String s){
        char[] c = s.toCharArray();
        String[] a = new String[c.length];
        for(int i = 0; i<a.length; i++){
            a[i]=Character.toString(c[i]);
        }
        return a;
    }
}