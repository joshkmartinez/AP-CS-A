/*
 * Lesson 30 Coding Activity 
 * Due to a problem with a scanner an array of words was created 
 * with spaces in incorrect places. Write the code to process the 
 * list of words and trim any spaces out of the words.
 *
 * So if the list contains:
 *      {"every", " near ing ", " checking", "food ", "stand", "value "}
 *
 * It should be changed to hold:        
 *      {"every", "nearing", "checking", "food", "stand", "value"}
 *         
 * Note that this activity does not require you to print anything. 
 * Your code should end with the array list still declared and
 * containing the resulting words.
 * 
 */

import java.util.Scanner;
//import java.util.Arrays;

class Lesson_30_Activity {

  /*
   * Your code should end with the following array modified as the instructions
   * above specify. You may modify the elements in this list but make sure you do
   * not add or remove anything from it.
   */
  public static String[] list = { "ev ery", " near ing ", " check ing", "f  ood ", "stand", "v alu e " };

  public static void main(String[] args) {

    for (int i = 0; i < list.length; i++) {
      // loop through all chars
      for (int y = 0; y < list[i].length(); y++) {

        if (list[i].charAt(y) == ' '/* have to use single quotes with char */) {
          // take union of 2 strings
          String uno = list[i].substring(0, y);
          String dos = list[i].substring(y + 1);
          String newString = uno + dos;
          list[i] = newString;
        }
      }
    }
    // System.out.println(Arrays.toString(list));
  }
}