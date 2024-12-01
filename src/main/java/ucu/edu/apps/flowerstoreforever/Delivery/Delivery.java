package ucu.edu.apps.flowerstoreforever.Delivery;

import ucu.edu.apps.flowerstoreforever.Item;

import java.util.LinkedList;

public interface Delivery {

    String deliver(LinkedList<Item> items);
}
