package behavioral.observer;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 12:16
 */
public class Main {
    public static void main(String[] args) {
        Subject subject= new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("value is 2");
        subject.setState(1);
        System.out.println("\n======================");
        System.out.println("\nValue is 200");
        subject.setState(200);
    }
}
