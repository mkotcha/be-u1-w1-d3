// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void printRectangle(Rectangle rectangle) {
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetro: " + rectangle.getPerimeter());
    }

    public static void print2Rectangle(Rectangle rectA, Rectangle rectB) {
        System.out.println("Primo rettangolo");
        printRectangle(rectA);
        System.out.println("Secondo rettangolo");
        printRectangle(rectB);
        System.out.println("Somma rettangoli");
        System.out.println("Area: " + (rectA.getArea() + rectB.getArea()));
        System.out.println("Perimetro: " + (rectA.getPerimeter() + rectB.getPerimeter()));
    }

    public static void main(String[] args) {

        Rectangle rectA = new Rectangle(3, 7);
        Rectangle rectB = new Rectangle(3, 4);

        printRectangle(rectA);
        print2Rectangle(rectA, rectB);

    }
}