import java.util.ArrayList;

public class TF1 implements Channel{
    ArrayList<Observer> agencies;

    public TF1(ArrayList<Observer> newsAgencies) {
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
        if(n.country == "France") {
            System.out.println("TF1 reports: "+n.toString());
        }
    }
}
