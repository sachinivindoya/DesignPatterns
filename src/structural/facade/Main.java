package structural.facade;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 10:33
 */
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker= new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
