package patterns.creational.builder;

/**
 * moderate way - Constructor Telescoping
 * immutable
 * harder if not already in constructor
 * dependency to create menu items
 */
public class LunchMenuV2 {
    private String bread;
    private String salad;
    private String dressing;
    private String meat;

    public LunchMenuV2() {
    }

    public LunchMenuV2(String bread) {
        this.bread = bread;
    }

    public LunchMenuV2(String bread, String salad) {
        this.bread = bread;
        this.salad = salad;
    }

    public LunchMenuV2(String bread, String salad, String dressing) {
        this.bread = bread;
        this.salad = salad;
        this.dressing = dressing;
    }

    public LunchMenuV2(String bread, String salad, String dressing, String meat) {
        this.bread = bread;
        this.salad = salad;
        this.dressing = dressing;
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getSalad() {
        return salad;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
