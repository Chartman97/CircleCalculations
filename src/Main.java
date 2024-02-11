import java.util.Scanner;
// Take Radius(Inches)
// Output Diameter & Area & Circumference(Inches)
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius, pie, diameter, area, radiusSq, circumference;
        // Radius input & Confirmation
        System.out.println("\nHello! If you input a Radius in Inches.\nI will give you the diameter, area, and circumference of that circle in Inches.");
        System.out.print("Enter Radius in Inches Here ->");
        radius = in.nextDouble();
        // Conversions
        pie = Math.PI;
        radiusSq = radius * radius;
        diameter = 2 * radius;
        area = pie * radiusSq;
        circumference = 2 * pie * radius;
        // Output
        System.out.printf("\nDiameter = %.2f Inches\nArea =  %.4f Inches\nCircumference = %.4f Inches\nGood Bye\n", diameter, area, circumference);
    }
}