import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please input side length of square");
        System.out.println("side:");
        double side = scnr.nextDouble();
        double squareArea = areaSquare(side);
        
        System.out.println("Please input length and width of a rectangle");
        System.out.println("length:");
        double length = scnr.nextDouble();
        System.out.println("width:");
        double width = scnr.nextDouble();
        double squareRectangle = areaRectangle(length, width);
        
        System.out.println("Please input base and height of a triangle");
        System.out.println("base:");
        double base = scnr.nextDouble();
        System.out.println("height");
        double height = scnr.nextDouble();
        double squareTriangle = areaTriangle(base, height);
        
        System.out.println("Please input the radius of a circle");
        System.out.println("radius:");
        double radius = scnr.nextDouble();
        double squareCircle = areaCircle(radius);
        
        printAreas(squareArea, squareRectangle, squareTriangle, squareCircle);
    
    }
    
    public static double areaSquare(double side){
        if (side < 0) {
            System.out.println("Error: impossible");
            System.exit(0);
        } 
        return side*side;
}

    public static double areaRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Error: impossible");
            System.exit(0);
        } 
        return length*width;
    }

    public static double areaTriangle(double base, double height) {
        if (base < 0 || height < 0) {
         System.out.println("Error: impossible");
            System.exit(0);
        }
        return (base*height)/2.0; 
    }

    public static double areaCircle(double radius) {
        if (radius<0) {
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return (radius*radius) * Math.PI;
    }

    public static void printAreas(double square, double rectangle, double triangle, double circle) {
        System.out.println("Square area: " +  String.format("%.2f", square));
        System.out.println("Rectangle area: " +  String.format("%.2f", rectangle));
        System.out.println("Triangle area: " +  String.format("%.2f", triangle));
        System.out.println("Circle area: " + String.format("%.2f", circle));
    }
}
