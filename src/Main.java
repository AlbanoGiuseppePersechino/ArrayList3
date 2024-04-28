import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruits> fruits = new LinkedList<>();
        fruits.add(new Fruits("Apple"));
        fruits.add(new Fruits("Banana"));
        fruits.add(new Fruits("Orange"));

        System.out.println("Fruits = " + fruits);

        fruits.addFirst(new Fruits("Grape"));

        fruits.addLast(new Fruits("Pineapple"));

        System.out.println("Fruits Add = " + fruits);


    }
}
