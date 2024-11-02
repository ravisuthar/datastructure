package java8;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82

class Customer {
    private Long id;
    private String name;
    private Integer tier;

    public Customer(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}


class Order {

    private Long id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private Customer customer;
    private Set<Product> products;

    public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer, Set<Product> products) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = customer;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", status='" + status + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }
}


class Product {

    private Long id;
    private String name;
    private String category;
    private Double price;

    public Product(Long id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Java8Problems {

    public static void main(String[] args) {

        Customer ravi = new Customer(1L, "Ravi", 1);
        Set<Product> products = Set.of(new Product(1L, "Laptop", "Electronics", 80000.00),
                new Product(2L, "Monitor", "Electronics", 20000.00),
                new Product(3L, "Keyboard", "Electronics", 2000.00),
                new Product(4L, "Mouse", "Electronics", 500.00));

        Customer ritu = new Customer(1L, "Ravi", 1);
        Set<Product> houseHold = Set.of(new Product(1L, "Washing Machine", "Electronics", 80000.00),
                new Product(2L, "Bed", "Furniture", 20000.00),
                new Product(3L, "Almirah", "Furniture", 2000.00),
                new Product(4L, "TV", "Electronics", 500.00),
                new Product(4L, "Toys", "Toys", 200.00));


        List<Order> orders = List.of(new Order(1L, LocalDate.of(2021, 2, 2), LocalDate.now(), "Open", ravi, products),
                new Order(2L, LocalDate.of(2021, 3, 30), LocalDate.now(), "Open", ritu, houseHold));


        // Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
        List<Product> collect = products.stream()
                .filter(p -> p.getCategory().equals("Book"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());

        //Exercise 2 — Obtain a list of order with products belong to category “Baby”
        List<Order> babyOrder = orders.stream()
                .filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equals("Baby")))
                .collect(Collectors.toList());

        //Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
        List<Product> tops = houseHold.stream()
                .filter(p -> p.getCategory().equals("Toys"))
                .map(p -> {
                    p.setPrice(p.getPrice() * .9);
                    return p;
                })
                .collect(Collectors.toList());
        //System.out.println(tops);

        //Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
        List<Product> collect1 = orders.stream()
                .filter(o -> o.getOrderDate().isAfter(LocalDate.of(2021, 2, 1))
                        && o.getOrderDate().isBefore(LocalDate.of(2021, 4, 1)))//date is not inclusive
                .flatMap(o -> o.getProducts().stream())
                .collect(Collectors.toList());
        //System.out.println(collect1);

        //Exercise 5 — Get the cheapest products of “Books” category
        Product electronic = products.stream().filter(p -> p.getCategory().equals("Electronics"))
                //.sorted((a,b) -> a.getPrice().compareTo(b.getPrice())) // java8.Product cannot be cast to class java.lang.Comparable if sort logic is not implemented
                .sorted(Comparator.comparing(Product::getPrice))
                .findFirst()
                .orElseThrow();
       // System.out.println(electronic);

        //Exercise 6 — Get the 3 most recent placed order
        List<Order> collect2 = orders.stream().sorted(Comparator.comparing(Order::getOrderDate)).limit(3).collect(Collectors.toList());
       // System.out.println(collect2);


        //Exercise 7 — Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list
        List<Order> collect3 = orders.stream()
                .filter(o -> o.getOrderDate().equals(LocalDate.of(2021, 2, 2)))
               // .peek(o -> System.out.println(o))
                .collect(Collectors.toList());


        //Exercise 8 — Calculate total lump sum of all orders placed in Feb 2021
        double sum = orders.stream().filter(o -> o.getOrderDate().equals(LocalDate.of(2021, 1, 31))
                        && o.getOrderDate().equals(LocalDate.of(2021, 3, 1)))
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();

        //Exercise 9 — Calculate order average payment placed on 14-Mar-2021
        /*Double average = orders.stream()
                .filter(o -> o.getOrderDate().equals(LocalDate.of(2021, 3, 14)))
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .average()
                .getAsDouble();*/

        //Exercise 10 — Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”
      //  DoubleSummaryStatistics books = products.stream()
      //          .filter(p -> p.getCategory().equals("Books"))
      //          .mapToDouble(Product::getPrice)
      //          .summaryStatistics();// No value present
        //System.out.println(books);

        //Exercise 11 — Obtain a data map with order id and order’s product count
        Map<Long, Long> collect4 = orders.stream().collect(Collectors.toMap(order -> order.getId(), order -> order.getProducts().stream().count()));
        //System.out.println(collect4);


        //Exercise 12 — Produce a data map with order records grouped by customer
        Map<Customer, Long> collect5 = orders.stream().collect(Collectors.toMap(o -> o.getCustomer(), o -> o.getProducts().stream().count()));
        //System.out.println(collect5);
        Map<Customer, List<Order>> collect6 = orders.stream().collect(Collectors.groupingBy(Order::getCustomer));
        //System.out.println(collect6);

        //imp
        //Exercise 13 — Produce a data map with order record and product total sum
        Map<Order, Double> collect7 = orders.stream().collect(Collectors.toMap(Function.identity(),
                order -> order.getProducts().stream()
                        .mapToDouble(p -> p.getPrice()).sum()));
       // System.out.println(collect7);


        //Exercise 14 — Obtain a data map with list of product name by category
        Map<String, List<Product>> collect8 = orders.stream()
                .flatMap(o -> o.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory));
        //System.out.println(collect8);

        //Exercise 15 — Get the most expensive product by category
        Product expensiveProduct = orders.stream()
                .flatMap(o -> o.getProducts().stream())
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(1)
                .findFirst()
                .orElseThrow();
        //System.out.println(expensiveProduct);

        Map<String, Optional<Product>> collect9 = products.stream()
                .collect(Collectors.groupingBy(Product::getName, Collectors.maxBy(Comparator.comparing(Product::getPrice))));
        //System.out.println(collect9);


    }
}

