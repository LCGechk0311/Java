package dataStructure;
import java.util.*;

public class testQueue {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        while(true) {
            System.out.print(">>");
            try {
                // 화면으로부터 라인단위로 입력받는다.
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input)) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말");
                    System.out.println("q 또는 Q - 프로그램 종료");
                    System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    //입력받은 명령어를 저장하고,
                    save(input);

                    // LinkedList의 내용을 보여줌
                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext())
                        System.out.println(++i + "." + it.next());
                } else {
                    save(input);
                    System.out.println(input);
                } // if(input.equalsIgnoreCase("q")){
            } catch (Exception e) {
                System.out.println("입력오류");
            }
        }// while(true)
    } // main()

    public static void save(String input){
        // queue에 저장
        if(!"".equals(input))
            q.offer(input);

        // queue에 최대크기를 넘으면 제일 처음 입력된 것을 삭제
        if(q.size() > MAX_SIZE)
            q.remove();
    }
}
