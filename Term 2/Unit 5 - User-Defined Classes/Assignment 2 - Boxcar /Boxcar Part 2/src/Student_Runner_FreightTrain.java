public class Student_Runner_FreightTrain {

    public static void main(String[] args) {
      System.out.println("1. Test the default constructor FreightTrain()");
      FreightTrain train1 = new FreightTrain();
      System.out.println("Printing FreightTrain():\n" + train1 + "\n");

      System.out.println("\n2. Test the constructor FreightTrain(n)");
      FreightTrain emptyTrain = new FreightTrain(0);
      System.out.println("Printing emptyTrain (n=0):\n" + emptyTrain + "\n");
      FreightTrain negativeTrain = new FreightTrain(-7);
      System.out.println("Printing negativeTrain (n=-7):\n" + emptyTrain + "\n");
      FreightTrain trainWithFiveCars = new FreightTrain(5);
      System.out.println("Printing trainWithFiveCars (n=5):\n" + trainWithFiveCars + "\n");

      System.out.println("\n3. Test setCargo(String)");
      //trainWithFiveCars currently has all cars carrying gizmos. Change them to gadgets
      trainWithFiveCars.setCargo("gadgets");
      System.out.println("Printing trainWithFiveCars with cargo now gadgets:\n" + trainWithFiveCars + "\n");
      //now set trainWithFiveCars to cargo of "onions". Since this is invalid, it should set the cargo back to gizmos.
      trainWithFiveCars.setCargo("onions");
      System.out.println("Printing trainWithFiveCars with cargo of onions (back to gizmos):\n" + trainWithFiveCars + "\n");

      System.out.println("\n4. Test fillTrain()");
      //Let's fill train 1. All Boxcars should now contain a cargo of size 10.
      trainWithFiveCars.fillTrain();
      System.out.println("Printing trainWithFiveCars with all Boxcars full:\n" + trainWithFiveCars + "\n");

      System.out.println("\n5. Test callForRepair(n)");
      //Let's set the second car (index 1) of trainWithFiveCars to in repair.
      trainWithFiveCars.callForRepair(1);
      System.out.println("Printing trainWithFiveCars with second car in repair:\n" + trainWithFiveCars + "\n");

      System.out.println("\n6. Test setMultiCargo()");
      //Let's make a train of length 8, setMultiCargo on it, and make sure the cargo type alternates appropriately
      FreightTrain trainWithEightCars = new FreightTrain(8);
      trainWithEightCars.setMultiCargo();
      System.out.println("Printing multi Cargo 8-car train:\n" + trainWithEightCars + "\n");

    }
}
