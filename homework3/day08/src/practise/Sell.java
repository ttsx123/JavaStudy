package practise;

public class Sell {
    private String name;

    public String getName(String name){
        System.out.println("销售员的姓名是："+name);
        return name;
    }

    public void selle(Excelle car1){
        System.out.println("售出excelle一辆！！！");
    }

    public void sellr(Regal car2){
        System.out.println("售出Regal一辆！！！");
    }

    public void selld(Excelle[] car3,int num){
        for (int i = 0; i < car3.length; i++) {
            System.out.println("出售的第"+(i+1)+"辆车！！");
        }
    }
}
