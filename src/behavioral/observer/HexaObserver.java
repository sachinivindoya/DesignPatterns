package behavioral.observer;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 12:12
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
    this.subject=subject;
    subject.attach(this);
}

    @Override
    public void update() {
        System.out.println("Hex value"+ Integer.toHexString(subject.getState()));
    }
}

