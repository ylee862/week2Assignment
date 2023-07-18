public class Circle extends Shape{

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double calculateDiameter() {
        double diameter = radius * 2;
        return diameter;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = radius * (2 * Math.PI);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area = (Math.pow(radius, 2) * Math.PI);
        return area;
    }





}
