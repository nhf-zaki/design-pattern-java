package patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * provide prototype instance
 */
public class Registry {
    private Map<EItemType, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item getInstance(EItemType type) {
        Item item = null;
        try {
            item = items.get(type).clone();
        } catch (CloneNotSupportedException ce) {
            ce.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Book book = new Book();
        book.setTitle("Da Vinci Code");
        book.setPrice(200.0);
        book.setNumberOfPages(350);
        items.put(EItemType.Book, book);

        Movie movie = new Movie();
        movie.setTitle("Da Vinci Code");
        movie.setPrice(20.0);
        movie.setRuntime(2);
        items.put(EItemType.Movie, movie);
    }
}
