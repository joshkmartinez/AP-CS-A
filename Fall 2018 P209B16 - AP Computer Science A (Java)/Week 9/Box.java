public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public double Volume() {
        return length * width * height;
    }

    public double length() {
        return length;
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }
}