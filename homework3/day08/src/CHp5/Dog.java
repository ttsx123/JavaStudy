package CHp5;

public class Dog {
    String name;
    int age;
    boolean sex;
    public Dog(){

    }
    public Dog(String name,int age,boolean sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public void play(){
        System.out.println(name + "play");
    }
    public void play(int n){
        System.out.println(name +"play"+ n +" minutes");
    }
}
