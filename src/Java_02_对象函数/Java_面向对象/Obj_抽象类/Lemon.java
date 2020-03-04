package Java_02_对象函数.Java_面向对象.Obj_抽象类;

public class Lemon extends Fruits {
    public Lemon() {
        super("柠檬");
    }

    @Override
    public void flavour() {
        System.out.println(super.name + "很酸");
    }
}
