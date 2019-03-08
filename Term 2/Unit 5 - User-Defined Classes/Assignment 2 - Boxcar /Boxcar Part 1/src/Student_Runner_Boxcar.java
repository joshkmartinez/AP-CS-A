public class Student_Runner_Boxcar {

    public static void main(String[] args) {
      //Testing various required behaviors of the Boxcar constructor
      System.out.println("Testing Boxcar constructors:");
      Boxcar car1 = new Boxcar();
      System.out.println("Printing Boxcar():\n" + car1 + "\n");
      Boxcar car2 = new Boxcar("widgets", 7, false);
      System.out.println("Printing Boxcar(\"widgets\", 7, false):\n" + car2 + "\n");
      Boxcar car3 = new Boxcar("WaDGeTs", 7, true);
      System.out.println("Testing lowercase cargo and setting cargo to 0 if in repair.\n");
      System.out.println("Printing Boxcar(\"WaDGeTs\", 7, true):\n" + car3 + "\n");
      Boxcar car4 = new Boxcar("OtherStuff", 7, false);
      System.out.println("Testing cargo other than accepted values.\n");
      System.out.println("Printing Boxcar(\"OtherStuff\", 7, true):\n" + car4 + "\n");

      // car2 is not burnt out. Lets call callForRepair on car2 and make sure it
      // gets marked for repair and set to 0 units.
      System.out.println("Testing callForRepair:");
      car2.callForRepair();
      System.out.println("Printing Boxcar called for repair:\n" + car2 + "\n");

      // Let's test the loadCargo() method. We'll make a new Boxcar with 7 gadgets, then load cargo until it reaches maximum capacity.
      Boxcar car5 = new Boxcar("gadgets", 7, false);
      car5.loadCargo();
      //car5 should print out with 8 gadgets
      System.out.println("Printing Boxcar with 8 gadgets:\n" + car5 + "\n");
      //now let's load cargo three more times. This should put the car over maximum capacity and should keep the cargo size at 10.
      car5.loadCargo();
      car5.loadCargo();
      car5.loadCargo();
      System.out.println("Printing Boxcar with 10 gadgets, tried to overload:\n" + car5 + "\n");
      //lastly, let's test to make sure we can't load cargo onto a Boxcar that is in repair, using car2.
      car2.loadCargo();
      System.out.println("Printing Boxcar in repair, can't load (0 cargo):\n" + car2 + "\n");

      System.out.println("Testing isFull:");
      //Let's test a full car and a non-full car to make sure they return true and false, respectively.
      Boxcar car6 = new Boxcar("gizmos", 10, false);
      Boxcar car7 = new Boxcar("widgets", 7, false);
      System.out.println("Printing isFull on full car:\n" + car6.isFull() + "\n");
      System.out.println("Printing isFull on non-full car:\n" + car7.isFull() + "\n");

      System.out.println("Testing getCargo:");
      //Let's make sure car7 returns "widgets" as its cargo.
      System.out.println("Printing getCargo on a \"widgets\" car:\n" + car7.getCargo() + "\n");

      System.out.println("Testing setCargo:");
      //Making sure it can set cargo to "gadgets"
      car7.setCargo("gadgets");
      System.out.println("Setting cargo to gadgets:\n" + car7 + "\n");
      //Testing it will convert cargo to lowercase
      car7.setCargo("WADGetS");
      System.out.println("Testing lowercase conversion (WADGetS -> wadgets):\n" + car7 + "\n");
      //Testing it will set cargo to "gizsmos" if a nonvalid cargo is entered
      car7.setCargo("onions");
      System.out.println("Testing invalid cargo type sets to gizmos (onions -> gizmos):\n" + car7 + "\n");
    }
  }
