package patterns.creational.builder;

/**
 * moderate way - Constructor Telescoping
 * immutable
 * harder to modify
 */
public class LunchMenuVF {

    public static class Builder {
        private String bread;
        private String salad;
        private String dressing;
        private String meat;

        public Builder() {
        }

        public LunchMenuVF build() {
            return new LunchMenuVF(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }
        public Builder salad(String salad) {
            this.salad = salad;
            return this;
        }
        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }
        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private final String bread;
    private final String salad;
    private final String dressing;
    private final String meat;

    public LunchMenuVF(Builder builder) {
        this.bread = builder.bread;
        this.salad = builder.salad;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
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
