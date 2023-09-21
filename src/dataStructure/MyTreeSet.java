package dataStructure;
import java.util.*;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // 원소 추가
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Banana"); // 중복은 허용되지 않음

        System.out.println("TreeSet: " + treeSet);

        // 원소 검색
        boolean contains = treeSet.contains("Cherry");
        System.out.println("Contains 'Cherry': " + contains);

        // 원소 제거
        boolean removed = treeSet.remove("Banana");
        System.out.println("'Banana' removed: " + removed);

        // TreeSet 크기 확인
        int size = treeSet.size();
        System.out.println("Size of the TreeSet: " + size);

        // TreeSet 비어 있는지 확인
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("Is the TreeSet empty? " + isEmpty);

        // TreeSet 초기화
        treeSet.clear();
        System.out.println("Cleared TreeSet: " + treeSet);

        // Iterator를 사용한 TreeSet 순회
        treeSet.add("Grape");
        treeSet.add("Apple");
        treeSet.add("Orange");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }

        // first(), last() 메서드 사용
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // lower()와 higher() 메서드 사용
        String lowerElement = treeSet.lower("Banana");
        String higherElement = treeSet.higher("Banana");
        System.out.println("Lower Element of 'Banana': " + lowerElement);
        System.out.println("Higher Element of 'Banana': " + higherElement);

        // toArray() 메서드 사용
        String[] array = treeSet.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
