public abstract class Shape {

    protected String color;

    public int getDimension() {
        return 2;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        double area = 2*2;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 1*1;
        return perimeter;
    }


}
