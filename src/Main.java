import java.util.Scanner;

// Take Radius(Inches)
// Output Diameter & Area & Circumference(Inches)
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius, area, radiusSq, circumference, diameter, pie;
        pie = Math.PI;

        // Intro & Radius Input
        System.out.println("Hello!\nMy name is \"CircleCalculation\"...\nMy only function in life is to convert... stuff");
        System.out.println("Enter Radius, in Inches, Here ->");
        radius = in.nextDouble();

        // Conversions
        radiusSq = radiusSq(radius);
        diameter = diameterConvert(radius);
        area = areaConvert(radiusSq, pie);
        circumference = circumferenceConvert(radius, pie);

        // Output
        System.out.printf("\nAll answers are in Inches\nDiameter = %.2f\nArea = %.2f\nCircumference = %.2f\n", diameter, area, circumference);
        System.out.println("Please give me 10/10 :)");
    }

    // Conversions
    public static Double radiusSq(double radius) {
        return radius * radius;
    }

    public static Double diameterConvert(double radius) {
        return 2 * radius;
    }

    public static Double areaConvert(double radiusSq, double pie) {
        return pie * radiusSq;
    }

    public static Double circumferenceConvert(double radius, double pie) {
        return 2 * pie * radius;
    }
}