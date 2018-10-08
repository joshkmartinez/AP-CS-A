import java.util.Scanner;
import java.util.Random;
//import java.util.ArrayList;
public class WordGuess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        String dictonary1[] = new String[]{"hello","dog","cat", "computer", "apple","purple"};
        
        int randomWordIndex = (int)(Math.random() * (dictonary1.length - 1) + 1);
        String randomWord = dictonary1[randomWordIndex];
        
        System.out.println("The random word is: " + randomWord);
        
        int dashedWordLength = randomWord.length();
        
        String dashedWord = "";
        
        while (dashedWord.length() != randomWord.length()){
        dashedWord = dashedWord + "_";
        }
        
        System.out.println(dashedWord);
        
        System.out.println("Enter a character");
        char guess = input.next().charAt(0); 
        
        System.out.println("The character is: " + guess);
        /*
        while ( dashedWord != randomWord){
        
        
        }
        */
    }
    }