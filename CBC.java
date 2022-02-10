import java.util.ArrayList;

public class CBC implements Channel{
    ArrayList<Observer> agencies;

    public CBC(ArrayList<Observer> newsAgencies) {
        this.agencies = newsAgencies;
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
