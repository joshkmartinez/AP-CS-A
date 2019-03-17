/*
 * AP CS A
 * Term 2 - Assignment 4, Dashboard Comparable
 *
 */

public class Dashboard implements Comparable {

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

    public int getMiles() {
        return odometer;
    }

    public int getSpeed() {
        return speedometer;
    }

    public boolean check() {
        return checkEngine;
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

    public int compareTo(Object a) {
        Dashboard o = (Dashboard) a;
        if (odometer < o.odometer) {
            return -1;
        } else if (o.odometer < odometer) {
            return 1;
        } else {
            if (speedometer < o.speedometer) {
                return -1;
            } else if (o.speedometer < speedometer) {
                return 1;
            } else {
                if (!checkEngine && o.checkEngine)
                    return -1;
                else if (!o.checkEngine && checkEngine) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public String race(Dashboard d, int a, int b) {
        String an = "";
        for (int i = 0; i < a; i++) {
            accelerate();
            if (checkEngine) {
                break;
            }
        }
        for (int i = 0; i < b; i++) {
            d.accelerate();
            if (d.check()) {
                break;
            }
        }
        int s = 0;

        if (checkEngine) {
            an += "First car stalled out!";
            s = 1;
        }
        if (d.check()) {
            if (checkEngine) {
                an += "\n";
            }
            an += "Second car stalled out!";
            s = 2;
        }
        if (d.check() && checkEngine) {
            s = 0;
        }
        if (!d.check() && !checkEngine) {
            if (speedometer == d.getSpeed()) {
                s = 0;
            } else {
                if (speedometer > d.getSpeed()) {
                    s = 2;
                } else {
                    s = 1;
                }
            }
        }
        if (s == 0 && checkEngine && d.check()) {
            an += "\n";
        }
        if (s == 1) {
            an += "\n";
        }
        an += "\n" + toString() + "\n\n" + d + "\n\n";
        if (s == 0) {
            an += "It's a tie!";
        }
        if (s == 1) {
            an += "Car 2 has won the race!";
        }
        if (s == 2) {
            an += "Car 1 has won the race!";
        }
        return an;
    }

    public String difference(Dashboard o) {
        String a = "";
        if (odometer < o.odometer) {
            a += "First car will need to drive for ";
            a += (int) ((double) (o.odometer - odometer) / ((double) speedometer / 60)) + " minutes to catch second car.";
            return a;
        }
        a += "Second car will need to drive for ";
        a += (int) ((double) (odometer - o.odometer) / ((double) o.speedometer / 60)) + " minutes to catch first car.";
        return a;
    }
}