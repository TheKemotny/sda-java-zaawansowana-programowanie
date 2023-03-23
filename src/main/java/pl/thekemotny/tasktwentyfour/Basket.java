package pl.thekemotny.tasktwentyfour;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public static final int BASKET_MAX_SIZE = 10;
    public static final int BASKET_MIN_SIZE = 0;
    private int count;
    private final List<Item> items = new ArrayList<>();

    private void addToBasket(Item item) throws BasketFullException {
        //if (count >= BASKET_MAX_SIZE) {
        if(items.size() >= BASKET_MAX_SIZE) {
            throw new BasketFullException("BASKET IS FULL");
        }
        count++;
        items.add(item);
    }
    private void removeFromBasket(Item item) {
        //if (count <= BASKET_MIN_SIZE) {
        if(items.size() == BASKET_MIN_SIZE) {
            try {
                throw new BasketEmptyException("BASKET IS EMPTY");
            } catch (BasketEmptyException e) {
                throw new RuntimeException(e);
            }
        }
        count--;
        items.remove(item);
    }
}
