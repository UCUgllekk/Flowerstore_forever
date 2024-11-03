package ua.edu.ucu.apps.flowerstore.flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    private double price;
    String description;
    public abstract double getPrice();
    public String getDescription() {
        return description;
    }
}