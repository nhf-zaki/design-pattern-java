package patterns.creational.factory;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Website {
    protected Collection<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();

    public Collection<Page> getPages() {
        return pages;
    }
}
