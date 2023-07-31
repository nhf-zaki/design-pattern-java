package patterns.behavioural.observer;

import java.util.Objects;

public class ObserverDemo {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("breaking news");

        assert Objects.equals(observer.getNews(), "breaking news");
    }
}
