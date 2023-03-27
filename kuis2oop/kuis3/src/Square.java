public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        this.setWidth(side) ;
        this.setLength(side);
    }
    public void setWidth(double side){
        this.setWidth(side);
    }
    public void setLength(double side){
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "Square dengan side=" + getSide() +"merupakan subclass dari" + super.toString();
    }
}
