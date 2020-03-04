package Java_02_对象函数.Java_面向对象.Obj_抽象类;

/**
 * 水果类 - 抽象类
 * 个人理解：
 * 抽象类中定义的抽象方法其子类必须
 * 强制性实例化他的抽象方法，可以说
 * 起到了良好的约束效果。
 * （抽象类并不在乎自己定义的抽象方法，
 *   他只在乎继承者有没有实现）
 * 注：抽象类不可被final修饰；
 */
public abstract class Fruits {
    protected String name;

    public Fruits(String name) {
        this.name = name;
    }

    //味道
    public abstract void flavour();
}
