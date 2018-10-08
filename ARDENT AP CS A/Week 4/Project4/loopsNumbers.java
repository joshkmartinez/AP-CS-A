import java.util.Scanner;

public class loopsNumbers {
    public static void main(String[] args) {
            System.out.println("while loop: all numbers 1-100 (inclusive) divisible by 7");
            int c = 1;
            while (c <= 100){
            if(c%7==0){
            System.out.println(c);
            }
            c++;
            }
            
            
            System.out.println("foor loop equivilent");
            
            for (c =1; c <= 100; c++){
            if(c%7==0){
            System.out.println(c);
            }
            
            }
        
        }       
    }
