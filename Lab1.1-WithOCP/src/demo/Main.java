package demo;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 5.0;
        rectangle.width = 4.0;

        Circle circle = new Circle();
        circle.radius = 3.0;

        AreaCalculator areaCalculator = new AreaCalculator();

        double rectangleArea = areaCalculator.calculateShapeArea(rectangle);
        double circleArea = areaCalculator.calculateShapeArea(circle);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Circle Area: " + circleArea);
    }
}
