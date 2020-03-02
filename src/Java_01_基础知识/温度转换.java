package Java_01_基础知识;

import java.util.Scanner;

public class 温度转换 {
    public static void main(String[] args) {
        //输入华氏温度值，转换为摄氏温度输出。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入华氏温度:");
        double num = new Double(scanner.next());
        double t = 5 * (num - 32) / 9;
        System.out.printf("%.2f摄氏度°C",t);
    }
}
