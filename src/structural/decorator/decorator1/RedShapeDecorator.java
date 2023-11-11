package structural.decorator.decorator1;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 11:16
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }
    public void draw(){
        decoratorShape.draw();
        setRedShape(decoratorShape);
    }
    private void setRedShape(Shape redShape){
        System.out.println("set red boader");
    }
}
