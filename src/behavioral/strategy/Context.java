package behavioral.strategy;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 12:36
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public int executeOperation(int num1, int num2){
        return strategy.doOperation(num1,num2);
    }
}
