package behavioral.observer;

import behavioral.observer.Observer;
import behavioral.observer.Subject;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 12:03
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary value" +Integer.toBinaryString(subject.getState()));
    }
}
