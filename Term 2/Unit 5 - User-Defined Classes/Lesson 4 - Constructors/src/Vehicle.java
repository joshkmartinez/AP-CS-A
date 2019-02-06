public class Vehicle {
    private int location;

    public Vehicle() {
        location = 0;
    }

    public Vehicle(int l) {
        if (l <= 20 && l >= -20) {
            this.location = l;
        }
    }

    public void forward() {
        location++;
        if (location > 20) {
            location--;
        }
    }

    public void backward() {
        location--;
        if (location < -20) {
            location++;
        }
    }

    public int getLocation() {
        return location;
    }

    public String toString() {
        String a = "";
        for (int i = -20; i < location; i++) {
            a += " ";
        }
        a += "@";
        return a;
    }

}
