package structural.facade;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 10:23
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle= new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }

}
