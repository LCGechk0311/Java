package dataStructure;
import java.util.*;

// 열거형 Day 정의
enum Day {
    MONDAY("Monday", 1) {
        @Override
        public void printDayInfo() {
            System.out.println("This is the first day of the week.");
        }
    },
    TUESDAY("Tuesday", 2) {
        @Override
        public void printDayInfo() {
            System.out.println("This is the second day of the week.");
        }
    },
    SATURDAY("SATURDAY", 3) {
        @Override
        public void printDayInfo() {
            System.out.println("Saturday");
        }
    };


    private final String dayName;  // 열거형 멤버 변수: 요일 이름
    private final int dayNumber;   // 열거형 멤버 변수: 요일 번호

    // 열거형 생성자
    Day(String dayName, int dayNumber) {
        this.dayName = dayName;
        this.dayNumber = dayNumber;
    }

    // 요일 이름(dayName)을 반환하는 메서드
    public String getDayName() {
        return dayName;
    }

    // 요일 번호(dayNumber)를 반환하는 메서드
    public int getDayNumber() {
        return dayNumber;
    }

    // 주말 여부를 확인하는 메서드
    public boolean isWeekend() {
        return this == SATURDAY;
    }

    // 추상 메서드: 요일 정보 출력
    public abstract void printDayInfo();
    }

public class MyEnum {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        Day tuesday = Day.TUESDAY;
        Day saturday = Day.SATURDAY;

        System.out.println("Is Monday a weekend? " + monday.isWeekend());  // false 출력
        System.out.println("Is Tuesday a weekend? " + tuesday.isWeekend()); // false 출력
        System.out.println("Is Saturday a weekend? " + saturday.isWeekend()); // true 출력

        System.out.println("Monday's day name: " + monday.getDayName());   // "Monday" 출력
        System.out.println("Tuesday's day number: " + tuesday.getDayNumber()); // 2 출력

        monday.printDayInfo();  // "This is the first day of the week." 출력
        tuesday.printDayInfo(); // "This is the second day of the week." 출력
        saturday.printDayInfo(); // "This is the second day of the week." 출력
    }
}
