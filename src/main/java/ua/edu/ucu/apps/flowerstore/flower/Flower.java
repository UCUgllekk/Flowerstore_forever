package ua.edu.ucu.apps.flowerstore.flower;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor @Entity @Table
public class Flower extends Item{
    @Id
    private Long id;
    private String color;
    private int sepalLength;
    private double price;
    private FlowerType type;
    private String description;
    public Flower() {
        sepalLength = 0;
        price = 0;
    }
    public double getPrice(){
        return price;
    }
    public Flower(String color, int sepalLength, double price, FlowerType type){
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
        this.type = type;
        this.description = "A flower!";
    }

    public Flower(Flower flower) {
        color = flower.color;
        sepalLength = flower.sepalLength;
        price = flower.price;
        type = flower.type;
    }
    public String getColor() {
        return color.toString();
    }

}