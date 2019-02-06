//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = 0; //array length
        int a2 = 0;
        System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
        String[] array1 = new String[10000];
        for (int i = 0; i < array1.length; i++) {
            String x = scan.nextLine();
            if (x.equals("End")) {
                break;
            } else {
                array1[i] = (x.substring(0, 1).toUpperCase()) + (x.substring(1).toLowerCase());
                a1++;
            }
        }

        System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
        String[] array2 = new String[10000];
        for (int i = 0; i < array2.length; i++) {
            String x = scan.nextLine();
            if (x.equals("End")) {
                break;
            } else {
                a2++;
                array2[i] = (x.substring(0, 1).toUpperCase()) + (x.substring(1).toLowerCase());
            }
        }

        // System.out.println(Arrays.toString(array1));
        // System.out.println(Arrays.toString(array2));
        System.out.println("First Array");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != null) {
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println("\nSecond Array");
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != null) {
                System.out.print(array2[i] + " ");
            }
        }

        // test order
        boolean isWrong = false;
        for(int i = 0; i < a1 - 1; i++)
        if((array1[i].compareTo (array1[i+1] ) > 0))
          isWrong = true;
        for(int i = 0; i < a2 - 1; i++)
        if((array2[i].compareTo (array2[i+1] ) > 0))
          isWrong = true;
        
        
        String[] testalpha1 = array1;
        String[] testalpha2 = array2;
        for (int i = 0; i < testalpha1.length; i++) {
            if (testalpha1[i] != null) {
                for (int j = 1; j < testalpha1.length; j++) {
                    if (testalpha1[j] != null && testalpha1[j - 1].compareTo(testalpha1[j]) > 0) {
                        String temp = testalpha1[j - 1];
                        testalpha1[j - 1] = testalpha1[j];
                        testalpha1[j] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < testalpha2.length; i++) {
            if (testalpha2[i] != null) {
                for (int j = 1; j < testalpha2.length; j++) {
                    if (testalpha2[j] != null && testalpha2[j - 1].compareTo(testalpha2[j]) > 0) {
                        String temp = testalpha2[j - 1];
                        testalpha2[j - 1] = testalpha2[j];
                        testalpha2[j] = temp;
                    }
                }
            }
        }
        
        String[] combined = new String[a1+a2];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != null && array1[i].length() > 0) {
            combined[i]=array1[i];}}
            
            for (int i = 0; i < array2.length; i++) {
            if (array2[i] != null && array2[i].length() > 0) {
            combined[i+a1]=array2[i];}}
        
            for (int i = 0; i < combined.length; i++) {
            if (combined[i] != null) {
                for (int j = 1; j < combined.length; j++) {
                    if (combined[j] != null && combined[j - 1].compareTo(combined[j]) > 0) {
                        String temp = combined[j - 1];
                        combined[j - 1] = combined[j];
                        combined[j] = temp;
                    }
                }
            }
        }
            
        if (isWrong) {
            System.out.println("\nError: Arrays not in correct order");
        } else {
            System.out.println("\nMerged Array");
            for (String i : combined)
            {
                System.out.print(i + " ");
            }
            
        }
    }
}