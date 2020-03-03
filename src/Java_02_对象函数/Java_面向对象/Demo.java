package Java_02_对象函数.Java_面向对象;

public class Demo {
    public static void main(String[] args) {
        //人类
        Work work = new Work("孵化者集团", "魔法少女", 1000);
        Person matoka = new Person("鹿目圆", 15, "女生", work);
        Person homula = new Person("晓美焰", 14, "女生", work);
        matoka.introduce();
        homula.introduce();

        //魔女
        Witch witch = new Witch("魔女","绝望");
        witch.run("魔法少女");//相当于重载
        witch.run();
    }
}
