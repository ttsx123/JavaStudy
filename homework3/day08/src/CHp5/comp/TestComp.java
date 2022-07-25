package CHp5.comp;

public class TestComp {
    public static void main(String[] args) {
        Complex one = new Complex();
        one.real = 3;
        one.im = 5;
        Complex ce = new Complex();
        ce.real = 4;
        ce.im = 6;
        Complex d = one.chen(ce);
        System.out.println(d.real);
        System.out.println(d.im);
    }
}
