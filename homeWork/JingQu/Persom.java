package lei.JingQu;

public class Persom {
    String name;
    int age;
    public void say(){
        System.out.println("姓名是："+name);
        if (age<10){
            System.out.println("age:"+age);
            System.out.println("票价免费");
        }else {
            System.out.println("age:"+age);
            System.out.println("20$");
        }
    }

}
