import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
//import java.util.ArrayList;
public class WordGuess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        String dictonary1[] = new String[]{"hello","dog","cat", "taco", "steak", "computer", "apple","purple"};
        
        int randomWordIndex = (int)(Math.random() * (dictonary1.length - 1) + 1);
        String randomWord = dictonary1[randomWordIndex];
        
        //System.out.println("The random word is: " + randomWord);
        
        int dashedWordLength = randomWord.length();
        
        String dashedWord = "";
        
        while (dashedWord.length() != randomWord.length()){
        dashedWord = dashedWord + "_";
        }
        
        char[] dashedArray = dashedWord.toCharArray();
        char[] wordArray = randomWord.toCharArray();
        System.out.println();
        int guesses = 0;
        while ( !Arrays.equals(dashedArray, wordArray)){
            System.out.println(dashedArray);
            System.out.println("Enter a character.");
            char guess = input.next().charAt(0);
            System.out.println("You have chosen the character: " + guess);
            if (randomWord.indexOf(guess) >= 0){
                int charIndex = randomWord.indexOf(guess);
                dashedArray[charIndex] = guess;
                guesses++;
            }else{
            System.out.println("That letter is not in the secret word");
            guesses++;
            }
        
        }
        
        System.out.println("You guessed the word in " + guesses + " guesses!");
        
    }
    }