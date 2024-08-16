
package circle;

import java.util.Scanner;


public class Circlecalculation {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create a Circle object using the radius
        Circle circle = new Circle(radius);

        // Calculate the area and circumference
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        // Display the results
        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}

    

