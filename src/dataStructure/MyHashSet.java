package dataStructure;
import java.util.*;
public class MyHashSet {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> fruits = new HashSet<>();

        // add() 메서드를 사용하여 원소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana"); // 중복 원소는 허용되지 않음

        // HashSet 출력
        System.out.println("HashSet: " + fruits);

        // contains() 메서드를 사용하여 원소 확인
        String searchElement = "Banana";
        if (fruits.contains(searchElement)) {
            System.out.println("'" + searchElement + "' exists in the HashSet.");
        } else {
            System.out.println("'" + searchElement + "' does not exist in the HashSet.");
        }

        // size() 메서드를 사용하여 HashSet의 크기 확인
        int size = fruits.size();
        System.out.println("Size of the HashSet: " + size);

        // remove() 메서드를 사용하여 원소 제거
        String removeElement = "Cherry";
        if (fruits.remove(removeElement)) {
            System.out.println("'" + removeElement + "' removed from the HashSet.");
        } else {
            System.out.println("'" + removeElement + "' not found in the HashSet.");
        }

        // isEmpty() 메서드를 사용하여 HashSet이 비어 있는지 확인
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);

        // clear() 메서드를 사용하여 HashSet 비우기
        fruits.clear();
        System.out.println("Cleared HashSet: " + fruits);

        // addAll() 메서드를 사용하여 다른 컬렉션의 원소를 추가
        ArrayList<String> otherFruits = new ArrayList<>();
        otherFruits.add("Mango");
        otherFruits.add("Orange");
        fruits.addAll(otherFruits);
        System.out.println("HashSet after adding elements from ArrayList: " + fruits);

        // removeAll() 메서드를 사용하여 다른 컬렉션에 포함된 원소 제거
        fruits.removeAll(otherFruits);
        System.out.println("HashSet after removing elements from ArrayList: " + fruits);

        // retainAll() 메서드를 사용하여 다른 컬렉션에 포함된 원소만 남기고 나머지 제거
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.retainAll(otherFruits);
        System.out.println("HashSet after retaining elements from ArrayList: " + fruits);

        // toArray() 메서드를 사용하여 배열로 변환
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.print("HashSet elements as an array: ");
        for (String fruit : fruitsArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}
