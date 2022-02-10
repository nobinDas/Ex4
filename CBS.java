import java.util.ArrayList;

public class CBS implements Channel{
    ArrayList<Observer> agencies;

    public CBS(ArrayList<Observer> newsAgencies) {
        agencies = newsAgencies;
        for(Observer agency: agencies){
            agency.registerChannel(this);
        }
    }
    public void update(NewsItem n){
        for(Observer agency: agencies){
            display(n);
        }
    }

    public void display(NewsItem n) {
        if(n.country == "US") {
            System.out.println("CBS reports: "+n.toString());
        }
    }
}
