package task6;

public class Rectangle implements Resizable{
    private double sideA;
    private double sideB;



//    public double resizedA(double resizeBy, double sideA) {
//        return sideA * resizeBy;
//    }
//
//    public double resizedB(double resizeBy, double sideB) {
//        return sideB * resizeBy;
//    }

    public double rectangleArea(){
        //area = a*b
        double area = sideA * sideB;
        return area;
    }

    @Override
    public double resize(double resizeBy) {
        return rectangleArea()*resizeBy;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
