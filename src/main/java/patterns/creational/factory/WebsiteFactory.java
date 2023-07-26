package patterns.creational.factory;

public class WebsiteFactory {
    public static Website getWebsite(EWebsiteType typeWebsite) {
        switch (typeWebsite) {
            case BLOG -> {
                return new Blog();
            }
            case SHOPPING -> {
                return new Shopping();
            }
            default -> {
                return null;
            }
        }
    }
}
