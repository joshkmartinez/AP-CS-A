public class Human {
    private String name;
    private double height;
    private double weight;

    public Human(String n, double h, double w) {
        name = n;
        height = h;
        weight = h;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return name + ": " + height + " meters tall, " + weight + " kilograms \n";
    }
}