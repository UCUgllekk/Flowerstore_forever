package ucu.edu.apps.flowerstoreforever.Decorator;

import ucu.edu.apps.flowerstoreforever.Item;
import ucu.edu.apps.flowerstoreforever.Flower.FlowerBucket;

public class RibbonDecorator extends AbstractDecorator {
    private Item item;
    public RibbonDecorator(FlowerBucket flowerBucket) {
        item = new FlowerBucket(flowerBucket);
        item.setDescription("Ribbon decorator");
    }

    @Override
    public double price() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 40 + item.price();
    }
}
