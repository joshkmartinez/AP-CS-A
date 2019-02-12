public class Rectangle extends Shape{
    private double height;
    private double width;
    public Rectangle(double w, double h){
        height=h;
        width=w;
    }
    public double getArea(){
        return width*height;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setWidth(double w){
        width = w;
    }
    public String toString(){
        return "Width is: " +width + "   Height is: " + height;
    }
    public boolean equals(Object o){
        Rectangle r =(Rectangle)o;
        if(getArea()==r.getArea() && getWidth()==r.getWidth()){
            return true;
        }
        return false;
    }
}