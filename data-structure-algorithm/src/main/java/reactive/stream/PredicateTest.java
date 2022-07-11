package reactive.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Apple{
   private String color;
    private Float weight;

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Apple(String color, Float weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
public class PredicateTest {

    public static void main(String[] args) {

        List<Apple> list = new ArrayList<>();
        list.add(new Apple("Green", 50F));
        list.add(new Apple("Green", 100F));
        list.add(new Apple("Green", 200F));
        list.add(new Apple("Green", 300F));

        list.add(new Apple("Red", 50F));
        list.add(new Apple("Red", 100F));
        list.add(new Apple("Red", 200F));
        list.add(new Apple("Red", 300F));

        list.add(new Apple("Yellow", 50F));
        list.add(new Apple("Yellow", 100F));
        list.add(new Apple("Yellow", 200F));
        list.add(new Apple("Yellow", 300F));


        System.out.println(getApples(list, a-> a.getColor().equals("Green") ));

        //print green apples with more than 150gm

       /* List<Apple> green = list.stream()
                .filter(a -> a.getColor().equals("Green") && a.getWeight() >= 150F)
                .collect(Collectors.toList());

        System.out.println(green);*/

    }

    private static List<Apple> getApples(List<Apple> list, Predicate<Apple> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
