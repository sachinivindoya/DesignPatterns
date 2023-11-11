package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : R.M.Sachini Vinodya
 * Date    : 11/11/2023
 * Time    : 11:58
 */
public class Subject {

    List<Observer> observerList = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer:observerList){
            observer.update();
        }
    }
}
