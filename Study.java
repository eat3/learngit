/**
 * Created by Mr.liu on 2017/1/25.
 */
class Person{
    String name;
    int age;
    Person(){
        System.out.println("I haven't ......");
    }
    void Say(){
        System.out.println("I love you");
    }
    Person(String name,int age){
        this.name=name;
        this.age = age;
    }
}
class Fei extends Person{
    String like;
    Fei(){
        super();
        System.out.println("你二大爷");
    }
    Fei(String name,int age,String like){
        super(name, age);
        this.like = like;

    }

}
public class Study{
    public static void main(String args[]){
        Fei Y = new Fei();
        Fei I = new Fei("刘鹏飞",19,"爸爸");
        System.out.println(I.name +I.age+I.like  );
        I.Say();
    }
}
