package patterns.structural.flyweight;

import patterns.structural.bridge.Color;

public interface Vehicle {
    void start();
    void stop();
    Color getColor();
}
