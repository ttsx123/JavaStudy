package lei;

public class Bank {
    public static void main(String[] args) {
        Account one = new Account();
        Customer two = new Customer();
        two.address = "123123";
        two.name="123";
        two.haoMa=123123;
        two.number=7651238;

        one.Customer = two.name;
        one.cid = 123;
        one.balance=17678.9;

        one.getInof();
        two.say();
    }

}
