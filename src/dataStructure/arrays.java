package dataStructure;
import java.util.*;
public class arrays {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13},{21,22,23}};

        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("arr="+Arrays.deepToString(arr2D));

        int[] arr5 = Arrays.copyOfRange(arr,2,4);
        int[] arr6 = Arrays.copyOfRange(arr,0,7);

        System.out.println("arr5="+Arrays.toString(arr5));
        System.out.println("arr5="+Arrays.toString(arr6));
    }
}
