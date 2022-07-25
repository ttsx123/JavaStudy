package practise;

public class TestCar {
    public static void main(String[] args) {
        Sell one = new Sell();
        one.getName("张三");

        Excelle car1 = new Excelle("1","suv");
        one.selle(car1);
        Regal car2 = new Regal("2","mini");
        one.sellr(car2);
        Excelle car3[] = new Excelle[10];
        car1.getId("1");
        car1.getType("suv");
        one.selld(car3,10);
    }
}
