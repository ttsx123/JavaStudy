package gouZhao;

public class Dog {
    String name ;
    int health=100;
    int love;
    String pinZhong;

    public Dog(){
        this.show();
        health = 100;
        System.out.println("这是无参构造器！！！");
    }

    public Dog(String name){
        this();
        name = "qq";
        System.out.println("这是有参构造器！！！");
    }

    public Dog(String name,int health){
        this(name);
        this.name = name;
        this.health = health;
        System.out.println("这是双参数有参构造器！！！");
    }

    public void show(){
        System.out.println("宠物的自白：");
        System.out.println("我的名字是："+name+"，健康值是："+health+"，和主任的亲密度是："+love+"，品种是："+pinZhong);
    }
}
