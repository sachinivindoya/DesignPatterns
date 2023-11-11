package behavioral.strategy;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 12:39
 */
public class Main {
    public static void main(String[] args) {
         Context context= new Context(new addOperation());
         System.out.println("Add operation (4,3)" + context.executeOperation(4,3));

        Context context1= new Context(new SubstractOperation());
        System.out.println("Add operation (4,3):" + context1.executeOperation(4,3));
    }
}
