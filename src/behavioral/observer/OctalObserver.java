package behavioral.observer;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 12:15
 */
public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal value"+ Integer.toOctalString(subject.getState()));
    }
}
