package task6;

public class ResizeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.printf("Area of the circle: %.2f\n", circle.circleArea());
        System.out.printf("Area of the circle: %.2f\n ", circle.resize(2));

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Area of the rectangle: "+ rectangle.rectangleArea());
        System.out.println("Area of the rectangle: "+ rectangle.resize(2));
    }
}
