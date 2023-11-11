package structural.decorator.decorator1;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 11:21
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redcircle = new RedShapeDecorator(new Circle());
        Shape redrectangle = new RedShapeDecorator(new Square());

        System.out.println("Without Decorator");
        circle.draw();
        System.out.println("\nWith Decorator");
        redcircle.draw();
        System.out.println("\nWith Decorator");
        redrectangle.draw();
    }
}
