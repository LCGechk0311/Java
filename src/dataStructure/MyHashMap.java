package dataStructure;
import java.util.*;

public class MyHashMap {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, Integer> scores = new HashMap<>();

        // put 메서드를 사용하여 키-값 쌍 추가
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 92);

        // get 메서드를 사용하여 값을 조회
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's Score: " + aliceScore);

        // containsKey 메서드를 사용하여 키 존재 여부 확인
        boolean containsBob = scores.containsKey("Bob");
        System.out.println("Contains 'Bob': " + containsBob);

        // size 메서드로 HashMap의 크기 확인
        int size = scores.size();
        System.out.println("HashMap Size: " + size);

        // isEmpty 메서드로 HashMap이 비어 있는지 확인
        boolean isEmpty = scores.isEmpty();
        System.out.println("Is HashMap Empty? " + isEmpty);

        // keySet 메서드를 사용하여 모든 키 조회
        System.out.println("All Keys: " + scores.keySet());

        // values 메서드를 사용하여 모든 값 조회
        System.out.println("All Values: " + scores.values());

        // entrySet 메서드를 사용하여 모든 키-값 쌍 조회
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // remove 메서드로 키-값 쌍 제거
        scores.remove("Charlie");
        System.out.println("Removed 'Charlie': " + scores);

        // containsValue 메서드를 사용하여 값 존재 여부 확인
        boolean containsValue92 = scores.containsValue(92);
        System.out.println("Contains Value 92: " + containsValue92);

        // clear 메서드로 HashMap 비우기
        scores.clear();
        System.out.println("Cleared HashMap: " + scores);
    }
}
