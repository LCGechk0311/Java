package dataStructure;
import java.util.*;

public class MyStack {
    public static void main(String[] args) {
        // 스택 생성
        Stack<String> stack = new Stack<>();

        // push(element): 스택에 요소 추가
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // 스택 출력
        System.out.println("Stack: " + stack);

        // peek(): 맨 위의 요소 확인
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // pop(): 맨 위의 요소 제거 및 반환
        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // 스택 출력
        System.out.println("Stack after popping: " + stack);

        // isEmpty(): 스택이 비어있는지 확인
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // size(): 스택의 현재 크기 확인
        int size = stack.size();
        System.out.println("Stack Size: " + size);
    }
}
