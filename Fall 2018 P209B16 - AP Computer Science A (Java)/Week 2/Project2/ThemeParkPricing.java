import java.util.Scanner;
public class ThemeParkPricing
{
    public static void main(String[] args)
{
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age:   ");
        int age =  input.nextInt();
        
        
        System.out.println("Theme Park Prices!");
        if(age <= 3){
        System.out.println("Free admission!");
        }  else if(age <= 10){
        System.out.println("$200 Child Admission");
        } 
        else if(age > 10){
        System.out.println("$500 Standard Admission");
        } 
        else if(age >= 65){
        System.out.println("$250 Senior Admission");
        } 
        else if(age >= 100){
        System.out.println("Free Super Senior Admission");
        } 
        
        //System.out.println("Your a: " + x1 +" and/or " +x2);
        //NaN = not a number
}
}