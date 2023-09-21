package dataStructure;
import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        // 큐 생성
        Queue<String> queue = new LinkedList<>();

        // enqueue(element): 큐에 요소 추가
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        // 큐 출력
        System.out.println("Queue: " + queue);

        // peek(): 맨 앞의 요소 확인
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // dequeue(): 맨 앞의 요소 제거 및 반환
        String dequeuedElement = queue.poll();
        System.out.println("Dequeued Element: " + dequeuedElement);

        // 큐 출력
        System.out.println("Queue after dequeue: " + queue);

        // isEmpty(): 큐가 비어있는지 확인
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue Empty? " + isEmpty);

        // size(): 큐의 현재 크기 확인
        int size = queue.size();
        System.out.println("Queue Size: " + size);
    }
}
