package patterns.structural.bridge;

public class Traingle extends Shape {
    public Traingle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Triangle drawn. " + color.fill();
    }
}
