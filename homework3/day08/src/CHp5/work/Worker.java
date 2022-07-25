package CHp5.work;

public class Worker {
    String name;
    int age;
    double salary;


    public Worker(){
    }

    public Worker(String name,int age,double salary){
        this.age = age;
        this.name = name;
        this.salary =salary;
        System.out.print("姓名："+name+"，年龄："+age+"，工资为："+salary+",");
        Address addr = new Address("北京市海淀区","10084");
    }

    public void work(){
        System.out.println("今天工作了20分钟！！");
    }

    public void working(int hour){
        System.out.println("今天一共工作了："+hour+"小时");
    }

}
