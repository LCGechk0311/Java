package dataStructure;
import java.util.Arrays;

public class array {
    private Object[] data; // 요소를 저장할 배열
    private int size; // 배열의 현재 크기

    // 생성자 : 초기 배열 크기를 10으로 설정하고 size를 0으로 초기화
    public array(){
        data = new Object[10];
        size = 0;
    }

    // 요소를 배열의 끝에 추가하는 메서드
    public void add(Object element){
        ensureCapacity();   // 배열 크기 조절
        data[size++] = element; // 요소 추가
    }

    // 지정한 인덱스에 요소를 추가하는 메서드
    public void add(int index, Object element){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        ensureCapacity();   // 배열 크기 조절

        // 지정한 인덱스부터 뒤로 한 칸씩 요소를 이동
        for (int i = size; i>index; i--){
            data[i] = data[i-1];
        }
        data[index] = element;  // 요소 추가
        size++;
    }

    // 지정한 인덱스의 요소를 변경하는 메서드
    public Object set(int index,Object element){
        if (index < 0 || index >=size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Object previousElement = data[index];   // 이전 요소 저장
        data[index] = element;  // 요소 변경
        return previousElement; // 이전 요소 반환
    }

    // 요소를 검색하여 인덱스를 반환하는 메서드
    public int indexOf(Object element){
        for (int i = 0; i <size; i++){
            if (data[i].equals(element)){
                return i;
            }
        }
        return -1;  // 요소를 찾지 못한 경우 -1 반환
    }

    public boolean contains(Object element){
        // 요소를 포함하는지 검사
        return indexOf(element) != -1;
    }

    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        array other = (array) obj;
        if(size != other.size){
            return false;
        }
        for (int i = 0; i < size ; i++){
            if(!data[i].equals(other.data[i])){
                return false;
            }
        }
        return true;
    }

    // 배열 크기 조절을 위한 private 메서드
    private void ensureCapacity(){
        if (size == data.length){
            int newCapacity = data.length * 2;  // 현재 배열 크기의 두 배
            data = Arrays.copyOf(data,newCapacity); // 배열 크기 확장
        }
    }

    // 배열 요소를 문자열로 표현하는 메서드
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i< size; i++){
            sb.append(data[i]);
            if(i < size -1 ){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        array dynamicArray = new array();   // 동적 배열 객체 생성

        dynamicArray.add("Apple");
        dynamicArray.add("Banana");
        dynamicArray.add("Cherry");

        dynamicArray.add(1,"Grape");

        dynamicArray.set(2, "Orange");

        System.out.println("Dynamic Array : " + dynamicArray);

        int index = dynamicArray.indexOf("Banana");
        System.out.println("Index of 'Banana' : " + index);

        boolean containsBanana = dynamicArray.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        array anotherArray = new array();
        anotherArray.add("Apple");
        anotherArray.add("Grape");
        anotherArray.add("Orange");
        anotherArray.add("Cherry");

        boolean equals = dynamicArray.equals(anotherArray);
        System.out.println("Equals anotherArray: " + equals);
    }
}
