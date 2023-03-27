public class Main {
    public static void main(String[] args) {
        Cylinder A = new Cylinder();
        Cylinder B = new Cylinder(7);
        Cylinder C = new Cylinder(10, 15);
        Cylinder D = new Cylinder(6,20, "Pink");
        // TANPA PARAMETER
        System.out.println("TANPA PARAMETER");
        System.out.println("Radius: " + A.getRadius());
        System.out.println("Color: " + A.getColor());
        System.out.println("Area: " + A.getArea());
        System.out.println("Height: " + A.getHeight());
        System.out.println("Volume: " + A.getVolume());
        System.out.println(A.toString());
        // PARAMETER 1
        System.out.println("PARAMETER 1");
        System.out.println("Radius: " + B.getRadius());
        System.out.println("Color: " + B.getColor());
        System.out.println("Area: " + B.getArea());
        System.out.println("Height: " + B.getHeight());
        System.out.println("Volume: " +B.getVolume());
        System.out.println(B.toString());
        //PARAMETER 2
        System.out.println("PARAMETER 2");
        System.out.println("Radius: " + C.getRadius());
        System.out.println("Color: " + C.getColor());
        System.out.println("Area: " + C.getArea());
        System.out.println("Height: " + C.getHeight());
        System.out.println("Volume: " +C.getVolume());
        System.out.println(C.toString());
        //PARAMETER 2
        System.out.println("PARAMETER 3");
        System.out.println("Radius: " + D.getRadius());
        System.out.println("Color: " + D.getColor());
        System.out.println("Area: " + D.getArea());
        System.out.println("Height: " + D.getHeight());
        System.out.println("Volume: " +D.getVolume());
        System.out.println(D.toString());
    }
}