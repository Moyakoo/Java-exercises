package Java_01_基础知识;

public class 乘法口诀表 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d x %d = %d   ",j,i,j*i);
            }
            System.out.println("");
        }
    }
}
