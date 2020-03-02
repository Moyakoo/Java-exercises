package Java_01_基础知识;

import java.lang.reflect.Array;

public class 数组长度 {
    public static void main(String[] args) {
        int[] arr;
        int num = 3;
        num *= num * 2-1;
        arr = new int[num];
        System.out.println(arr.length);
    }
}
