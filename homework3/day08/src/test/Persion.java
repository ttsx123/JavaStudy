package test;

public class Persion {
    String name;
    int age;
    //静态变量
    static String country;

    public Persion(){}
    //普通方法：可以调用Static方法和普通方法
    public void m1(){
        m2();
        n2();
        n1();
        System.out.println("m1......");
    }

    public void m2(){
        System.out.println("m2......");
    }
    //静态方法：可以调用静态方法
    static void n1(){
        n2();
        System.out.println("static n1......");
    }

    static void n2(){
        System.out.println("static n2......");
    }
    //构造类
    public Persion(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("姓名："+name+"，年龄："+age+"，国籍："+country);
    }

    public static void main(String[] args) {
        Persion.country = "中国";
        Persion one = new Persion("成龙",66);
//        Persion.n1();
//        Persion.n2();
        one.m1();
        Persion.n1();
    }
}
