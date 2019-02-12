public class Circle extends Shape{
    public static final double Pi = 3.14159;
    public double radius;
    public Circle(double r){
        radius=r;
    }
    public Circle(){
        radius=1;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r)
    {
        radius = r;
    }
    public double area(){
        return Pi*radius*radius;
    }
    public String toString(){
        return "Radius is " + radius + ",   " + "Area is " + area();
    }
    public boolean equals(Object o){
        Circle c = (Circle)o;
        if(getRadius()==c.getRadius()){
            return true;
        }
        return false;
    }
}