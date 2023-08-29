public class Circle {
    private double radius;
    private String colour;


    public Circle() {
        this.radius = 1.0;
        this.colour = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.colour = "red";
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
