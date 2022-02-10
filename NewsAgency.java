import java.util.ArrayList;

public class NewsAgency implements Observer{
    private ArrayList<Channel> channels;
    public Subject ow;
    private String agency;
    private NewsItem nsItem;

    public NewsAgency(String agency, Subject ow){
        this.ow = ow;
        this.agency = agency;
        ow.registerObserver(this);
    }

//    public void registerChannel(Channel c){
//        channels.add(c);
//    }

    public void update(NewsItem n){
        this.nsItem = n;
//        for (Channel channel : channels) {
//            channel.update(n);
//        }
    }

}
