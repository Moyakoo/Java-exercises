package Java_02_对象函数.Java_面向对象.Obj_抽象类;

public class Demo {
    public static void main(String[] args) {
        Polymorphic p = new Polymorphic();

        Apple apple = new Apple();
        Lemon lemon = new Lemon();

        p.test(apple);
        p.test(lemon);
    }
}
