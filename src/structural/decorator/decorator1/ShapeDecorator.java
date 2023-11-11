package structural.decorator.decorator1;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 11:04
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape=decoratorShape;
    }
    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
