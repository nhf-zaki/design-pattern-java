package patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.Collection;

public class NewsAgency {
    private String news;
    private Collection<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }
    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }
    public void setNews(String news) {
        this.news = news;
        for (Channel channel :
                this.channels) {
            channel.update(this.news);
        }
    }
}
