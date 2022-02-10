import java.util.ArrayList;

public class CBS implements Channel{
    ArrayList<Observer> agencies;

    public CBS(ArrayList<Observer> newsAgencies) {
        agencies = newsAgencies;
//        for(Observer agency: agencies){
//            agency.registerChannel(this);
//        }
    }
    public void update(NewsItem n){
        for(Observer agency: agencies){
            display(n);
        }
    }

    public void display(NewsItem n) {
        System.out.println("CBC reports: "+n.toString());
    }
}
