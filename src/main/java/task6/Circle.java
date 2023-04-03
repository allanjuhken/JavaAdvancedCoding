package task6;

public class Circle implements Resizable{
    private double radius;



    @Override
    public double resize(double resizeBy) {
        return circleArea() * resizeBy;
    }

    public double circleArea(){
        //area PI*r2
        return Math.PI*Math.pow(radius,2.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
