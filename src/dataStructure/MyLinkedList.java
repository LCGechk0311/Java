package dataStructure;
import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // 요소 추가
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Banana");

        // LinkedList 출력
        System.out.println("LinkedList: " + linkedList);

        // 요소 검색
        String searchElement = "Banana";
        if (linkedList.contains(searchElement)) {
            int firstIndex = linkedList.indexOf(searchElement);
            int lastIndex = linkedList.lastIndexOf(searchElement);
            System.out.println("First Index of '" + searchElement + "': " + firstIndex);
            System.out.println("Last Index of '" + searchElement + "': " + lastIndex);
        } else {
            System.out.println("'" + searchElement + "' not found in the LinkedList.");
        }

        // 특정 인덱스 위치에 요소 삽입
        linkedList.add(1, "Grape");
        System.out.println("Updated LinkedList after inserting 'Grape': " + linkedList);

        // 요소 제거
        String removeElement = "Cherry";
        if (linkedList.contains(removeElement)) {
            linkedList.remove(removeElement);
            System.out.println("'" + removeElement + "' removed from the LinkedList.");
        } else {
            System.out.println("'" + removeElement + "' not found in the LinkedList.");
        }

        // 특정 인덱스 위치의 요소 변경
        linkedList.set(2, "Orange");
        System.out.println("Updated LinkedList after changing element at index 2: " + linkedList);

        // LinkedList 크기 확인
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // LinkedList가 비어있는지 확인
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the LinkedList empty? " + isEmpty);

        // LinkedList 비우기
        linkedList.clear();
        System.out.println("Cleared LinkedList: " + linkedList);
    }
}
