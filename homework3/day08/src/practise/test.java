package practise;

class ClassA{
    int value;
}

public class test {

    public static void main(String args[]){
        ClassA ca = new ClassA();
        changeValue(ca);
        System.out.println(ca.value);
        changeRef(ca);
        System.out.println(ca.value);
    }

    public static void changeValue(ClassA ca){
        ca.value = 100;
    }

    public static void changeRef(ClassA ca){
        ca = new ClassA();
        ca.value = 200;
    }
}

