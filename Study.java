/**
 * Created by Mr.liu on 2017/1/25.
 */

class Person{
    String name;
    int age;
    Person(){
        System.out.println("did you love me?");
    }
    void say(){
        System.out.print("你的名字"+name+"你的年龄"+age);
    }
}
class Lover extends Person{
    private String who;
    public String getWho(){
        return who;
    }
    public void setWho(String who){
        this.who = who;
    }
    Lover(){
        System.out.println("yes!!!");
    }
    void say(){
        super.say();
        System.out.println("你喜欢过我吗"+getWho());
    }
}
class Study{
    public static void main(String args[]){
        Lover qiao = new Lover();
        qiao.name = "乔娟";
        qiao.age = 19;
        qiao.setWho("当年");
        qiao.say();
    }
}