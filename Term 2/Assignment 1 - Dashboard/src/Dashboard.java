/*
 * AP CS MOOC
 * Term 2 - Assignment 1, Dashboard
 * A class which represents a car dashboard.
 */

public class Dashboard {

    private int odometer;
    private int speedometer;
    private boolean checkEngine = false;

    public Dashboard() {
        odometer = 0;
        speedometer = 0;
    }

    public Dashboard(int o, int s) {
        if (o <= 99999 && o >= 0) {
            odometer = o;
        } else {
            odometer = 0;
            checkEngine = true;
        }
        if (s >= 0 && s <= 100) {
            speedometer = s;
        } else {
            speedometer = 0;
            checkEngine = true;
        }

    }

    private int dCount(int num) {
        //digit count
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    public String toString() {
        String a = "";
        a += "Speedometer: " + speedometer + " MPH\n";
        //lazy
        if (dCount(odometer) == 5) {
            a += "Odometer: " + odometer + "\n";
        } else if (dCount(odometer) == 4) {
            a += "Odometer: 0" + odometer + "\n";
        } else if (dCount(odometer) == 3) {
            a += "Odometer: 00" + odometer + "\n";
        } else if (dCount(odometer) == 2) {
            a += "Odometer: 000" + odometer + "\n";
        } else if (dCount(odometer) == 1) {
            a += "Odometer: 0000" + odometer + "\n";
        } else {
            a += "Odometer: 00000\n";
        }
        if (checkEngine) {
            a += "Check Engine: On";
        } else {
            a += "Check Engine: Off";
        }
        return a;
    }

    public void accelerate() {
        if (speedometer >= 0 && speedometer < 100) {
            speedometer++;
        } else {
            speedometer = 0;
            checkEngine = true;
        }
    }

    public void drive(int n) {

        double a = (n * speedometer) / 60;
        //System.out.println("SPEED ADDED" + a);
        odometer += (int) a;
        if (odometer > 99999) {
            odometer = 0;
            checkEngine = true;
        }
    }

}