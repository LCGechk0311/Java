package dataStructure;
import java.util.*;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}
public class MyGenerics {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("John", 30);
        Pair<String, String> pair2 = new Pair<>("Alice", "Bob");

        System.out.println("First: " + pair1.getFirst() + ", Second: " + pair1.getSecond());
        System.out.println("First: " + pair2.getFirst() + ", Second: " + pair2.getSecond());
    }
}
