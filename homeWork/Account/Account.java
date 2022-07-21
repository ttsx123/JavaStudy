package lei;

public class Account {
    int cid;
    double balance;
    String Customer ;
    public void getInof(){
        System.out.println("卡号："+cid);
        System.out.println("余额："+balance);
        System.out.println("用户："+Customer);
    }
    public void withdraw(){
        System.out.println("true");
    }
    public void save(){
        System.out.println("false");
    }
}
