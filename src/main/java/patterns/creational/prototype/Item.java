package patterns.creational.prototype;

public class Item implements Cloneable {
    private String title;
    private Double price;
    private String url;

    @Override
    public Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
