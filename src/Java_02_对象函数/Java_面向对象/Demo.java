package Java_02_对象函数.Java_面向对象;

public class Demo {
    public static void main(String[] args) {
        Work work = new Work("孵化者集团", "魔法少女", 1000);
        Person person = new Person("鹿目圆",14,"女生",work);

        person.introduce();
    }
}
