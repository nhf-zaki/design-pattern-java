package patterns.creational.factory;

public class Shopping extends Website {
    @Override
    public void createWebsite() {
        super.pages.add(new CartPage());
        super.pages.add(new ItemPage());
    }
}
