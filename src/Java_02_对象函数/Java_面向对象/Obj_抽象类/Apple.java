package Java_02_对象函数.Java_面向对象.Obj_抽象类;

public class Apple extends Fruits {
    public Apple() {
        super("苹果");
    }

    @Override
    public void flavour() {
        System.out.println(super.name + "甜甜");
    }
}
