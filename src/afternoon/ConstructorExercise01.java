package afternoon;

/**
 * 设置一个无参构造器：利用构造器设置所有人的age属性初始值都为18
 * 第二个构造器：带pName和pAge两个参数构造器：使用每次创建Person对象的同时初始化对象的age和name属性值。
 * 分别使用不同的构造器，创建对象
 * author：phil
 */
public class ConstructorExercise01 {
    public static void main(String[] args) {
      Person p1 = new Person();
        System.out.println("p1输出的name " + p1.name+" p1的age "+p1.age);

        Person p2 = new Person("jack",23);
        System.out.println("p2输出的name " + p2.name+" p2的age "+p2.age);
    }
}
class Person{
    int age ;
    String name;
    public Person(){
         age = 18;
    }
    public Person(String Pname,int Page){
        name = Pname;
        age = Page;
    }
}
