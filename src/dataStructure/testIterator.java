package dataStructure;
import java.util.*;

public class testIterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");

        ListIterator it = list.listIterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        System.out.println();

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println();
    }
}
