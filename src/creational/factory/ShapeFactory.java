package creational.factory;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 09:54
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }else{
            if( shapeType.equalsIgnoreCase("CIRCLE")){
                return new Circle();
            }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            }else if(shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }
        }
        return null;
    }
}
