package reactive.stream;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    private int id;
    private Long amount;

    public Product(int id, Long amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}

public class InventoryTest {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, 10L));
        list.add(new Product(4, 40L));
        list.add(new Product(2, 20L));
        list.add(new Product(5, null));
        list.add(null);

        System.out.println(list);

        //after java 8

        list.sort(Comparator.nullsFirst(Comparator.comparing(Product::getAmount, Comparator.nullsLast(Comparator.naturalOrder()))));
        System.out.println(list);

        //before java 8
       /* Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getAmount() == o2.getAmount()) return 0;
                else if (o1.getAmount() > o2.getAmount()) return 1;
                else return -1;
            }
        });

        System.out.println(list);*/
    }
}
