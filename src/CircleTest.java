public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.getArea();
        c1.getRadius();
        c1.setRadius(2.0);
        c1.setColour("blue");
        System.out.println("Circle 1: " +
                c1.getRadius() + ", " +
                c1.getArea() + ", " +
                c1.getColour());
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(2.0, "blue");
        System.out.println("Circle 2: " + c2.getRadius() + " " +
        c2.getArea()  + " " +
        c2.getColour()  + " " + "\n" + "Circle 3: " +
        c3.getColour()  + " " +
        c3.getArea()  + " " +
        c3.getRadius()  + " ");
    }
}
