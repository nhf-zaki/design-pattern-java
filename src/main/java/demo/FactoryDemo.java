package demo;

import patterns.creational.factory.EWebsiteType;
import patterns.creational.factory.Website;
import patterns.creational.factory.WebsiteFactory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(EWebsiteType.BLOG);
        System.out.println(blog);
        assert blog != null;
        System.out.println(blog.getPages());

        System.out.println();

        Website shopping = WebsiteFactory.getWebsite(EWebsiteType.SHOPPING);
        System.out.println(shopping);
        assert shopping != null;
        System.out.println(shopping.getPages());
    }
}
