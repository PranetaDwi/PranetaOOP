public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*2*radius;
    }

    @Override
    public String toString() {
        return "Circle dengan radius=" + radius +
        "merupakan subclass dari "+super.toString();
    }
}
