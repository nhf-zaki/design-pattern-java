package patterns.creational.factory;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        super.pages.add(new ContactPage());
        super.pages.add(new AboutPage());
    }
}
