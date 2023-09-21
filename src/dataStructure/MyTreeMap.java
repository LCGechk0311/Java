package dataStructure;
import java.util.*;

public class MyTreeMap {
    public static void main(String[] args) {
        // TreeMap 생성
        TreeMap<String, Integer> scores = new TreeMap<>();

        // put 메서드를 사용하여 키-값 쌍 추가
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 92);
        scores.put("David", 78);
        scores.put("Eve", 86);

        // TreeMap 출력
        System.out.println("TreeMap: " + scores);

        // get 메서드를 사용하여 값을 조회
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's Score: " + aliceScore);

        // keySet 메서드를 사용하여 모든 키 조회
        Set<String> keys = scores.keySet();
        System.out.println("Keys: " + keys);

        // values 메서드를 사용하여 모든 값 조회
        Collection<Integer> values = scores.values();
        System.out.println("Values: " + values);

        // entrySet 메서드를 사용하여 모든 키-값 쌍 조회
        Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();
        System.out.println("Entries: " + entrySet);

        // TreeMap의 크기 확인
        int size = scores.size();
        System.out.println("Size: " + size);

        // containsKey 메서드를 사용하여 특정 키가 존재하는지 확인
        boolean containsAlice = scores.containsKey("Alice");
        boolean containsFrank = scores.containsKey("Frank");
        System.out.println("Contains Alice: " + containsAlice);
        System.out.println("Contains Frank: " + containsFrank);

        // remove 메서드를 사용하여 키-값 쌍 제거
        scores.remove("David");
        System.out.println("TreeMap after removing David: " + scores);

        // clear 메서드를 사용하여 TreeMap 비우기
        scores.clear();
        System.out.println("Cleared TreeMap: " + scores);
    }
}
