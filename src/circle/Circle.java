
package circle;

public class Circle {
    private double radius;
    private final double pi = 22.0 / 7.0;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return pi * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * pi * radius;
    }

    // Getter for the radius
    public double getRadius() {
        return radius;
    }

    // Setter for the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

           
    

