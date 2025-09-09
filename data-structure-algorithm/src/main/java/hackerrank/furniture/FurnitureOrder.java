package hackerrank.furniture;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    private final HashMap<Furniture, Integer> order;

    public FurnitureOrder() {
        this.order = new HashMap<>();
    }

    @Override
    public void addToOrder(final Furniture type, final int count) {
        if (count > 0) {
            order.put(type, order.getOrDefault(type, 0) + count);
        }
    }

    @Override
    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return new HashMap<>(order);
    }

    @Override
    public int getTypeCount(Furniture type) {
        return order.getOrDefault(type, 0);
    }

    @Override
    public float getTypeCost(Furniture type) {
        return order.getOrDefault(type, 0) * type.cost();
    }

    @Override
    public float getTotalOrderCost() {
        return order.entrySet().stream()
                .map(entry -> entry.getKey().cost() * entry.getValue())
                .reduce(0.0f, Float::sum);
    }

    @Override
    public int getTotalOrderQuantity() {
        return order.values().stream().mapToInt(Integer::intValue).sum();
    }
}