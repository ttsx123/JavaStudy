package lei;

public class Testwife {
    public static void main(String[] args) {
        Wife one = new Wife();
        Husband two = new Husband();
        one.name = "tt";
        one.age = 12;
        two.age = 12;
        two.name = "ss";
        one.husband = two.name;
        two.wife = one.name;
        one.getInfo();
        two.getInfo();



    }
}
