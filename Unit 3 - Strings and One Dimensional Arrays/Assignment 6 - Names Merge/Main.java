import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] names1 = new String[10000];
    String[] names2 = new String[10000];
    int mergep1 = 0;
    int mergep2 = 0;
    int fakeboolean = 0;// hehee
    // need to check alphebetical Order
    System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
    for (int i = 0; i < names1.length; i++) {
      String input = scan.nextLine();
      names1[i] = (input.substring(0, 1).toUpperCase()) + (input.substring(1).toLowerCase()); // puts title case on name
      if (names1[i].equals("End")) {
        mergep1 = i;
        break;
      }
    }
    for (int i = 0; i < mergep1 - 1; i++)
      if ((names1[i].compareTo(names1[i + 1]) > 0)) {
        fakeboolean = 1;
    }
    System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
    for (int i = 0; i < names2.length; i++) {
      String input = scan.nextLine();
      names2[i] = (input.substring(0, 1).toUpperCase()) + (input.substring(1).toLowerCase());
      if (names2[i].equals("End")) {
        mergep2 = i;
        break;
      }
    }
    for (int i = 0; i < mergep2 - 1; i++)
      if ((names2[i].compareTo(names2[i + 1]) > 0)) {
        fakeboolean = 1;
      }

    if (fakeboolean == 1) {
      System.out.println("First Array");
      for (int i = 0; i < mergep1; i++) {
        System.out.print(names1[i] + " ");
      }
      System.out.println();
      System.out.println("Second Array");
      for (int i = 0; i < mergep2; i++) {
        System.out.print(names2[i] + " ");
      }
      System.out.println();
      System.out.println("Error: Arrays not in correct order");
    }
    // merge names
    else if (fakeboolean == 0) {
      int index1 = 0;
      int index2 = 0;
      int index3 = 0;
      String[] merged = new String[20000];
      int mergedEnd = (mergep1 + mergep2) - 1;
      while (index1 != mergep1 || index2 != mergep2) {
        if ((names2[index2].equals("End"))
            || !(names1[index1].equals("End")) && (names1[index1].compareTo(names2[index2]) < 0)) {
          merged[index3] = names1[index1];
          index1++;
          index3++;
        } else {
          merged[index3] = names2[index2];
          index2++;
          index3++;
        }
      }
      System.out.println("First Array");
      for (int i = 0; i < mergep1; i++) {
        System.out.print(names1[i] + " ");
      }
      System.out.println("\nSecond Array");
      for (int i = 0; i < mergep2; i++) {
        System.out.print(names2[i] + " ");
      }
      System.out.println("\nMerged Array");
      for (int i = 0; i <= mergedEnd; i++)
        System.out.print(merged[i] + " ");
    }
  }
}