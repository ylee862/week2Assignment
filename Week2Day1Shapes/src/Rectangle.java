public class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateDiagonal() {
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return diagonal;
    }

    @Override
    public double calculateArea() {
        double area = width * height;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = (width + height) * 2;
        return perimeter;
    }
}
