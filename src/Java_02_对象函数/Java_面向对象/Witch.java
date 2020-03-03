package Java_02_对象函数.Java_面向对象;

/**
 * 魔女 - 继承了Person
 * 个人理解：
 * 继承 - 在父级基础之上升级改良自己，
 * 子可以调用父但父不可调用子。
 */
public class Witch extends Person {
    String weapon;

    public Witch(String weapon) {
        this.weapon = weapon;
    }

    /*
    调用super()必须写在子类构造方法的第一行，否则编译不通过。
    每个子类构造方法的第一条语句，都是隐含地调用 super()，
    如果父类没有这种形式的构造函数，那么在编译的时候就会报错。
    - 摘自：菜鸟教程
    */
    public Witch(String name, String weapon) {
        super(name);//超类，相当与他的父类本身,定义了之后就可以使用它爸爸的东西了
        this.weapon = weapon;
    }

    //方法覆盖
    public void run() {
        System.out.println(super.name + "毁灭了世界。");
    }

}
