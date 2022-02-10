import java.util.ArrayList;

public class CBC implements Channel{
    ArrayList<Observer> agencies;

    public CBC(ArrayList<Observer> newsAgencies) {
        this.agencies = newsAgencies;
        for(Observer agency: agencies){
            agency.registerChannel(this);
        }
    }
    public void update(NewsItem n){
        display(n);
    }

    public void display(NewsItem n) {
        if(n instanceof NewsItem){
            System.out.println("CBC reports: "+n.toString());
        }
    }
}
