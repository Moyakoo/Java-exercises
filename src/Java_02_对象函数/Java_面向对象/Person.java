package Java_02_对象函数.Java_面向对象;


/**
 * 人类
 */
public class Person {
    String name;//姓名
    int age;//年龄
    String sex;//性别
    Work work;//职位

    //空的构造方法
    Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    //构造方法
    public Person(String name, int age, String sex, Work work) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.work = work;
    }

    public void run(String name) {
        System.out.println(name + "行动中……");
    }

    //自我介绍
    public void introduce() {
        System.out.printf("我的名字叫%s，是一名%d岁%s!身份是%s★\n", this.name, this.age, this.sex, this.work.duty);

    }
}
