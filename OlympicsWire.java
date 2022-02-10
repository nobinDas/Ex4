import java.util.*;


public class OlympicsWire implements Subject {
    private ArrayList<Observer> observers;
    private NewsItem nsItem;

    public OlympicsWire(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    public void notifyObservers(NewsItem n){
        for (Observer observer : observers) {
            observer.update(n);
        }
    }

    public void measurementsChanged() {
        notifyObservers(nsItem);
    }

    public void broadcast(NewsItem nT){
        System.out.println("New	Olympic	News Item!!");
        this.nsItem = nT;
        measurementsChanged();
    }
}
