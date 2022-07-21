package lei.ZhangHao;

import java.util.Scanner;

public class YongHu {
    Scanner input = new Scanner(System.in);
    String name;
    int miMa ;
    public void check(){
        boolean check = false;
        while (!check){
            System.out.println("请输入用户名：");
            String newYong = input.next();
            System.out.println("请输入密码：");
            int mima = input.nextInt();
            if (name.equals(newYong)&&mima==miMa){
                check = true;
                System.out.println("登录成功！！！！");
                System.out.println("请输入新的密码！！：");
                mima = input.nextInt();
                System.out.println("新密码是："+mima);
            }else {
                System.out.println("用户名或者密码错误！！！");
            }
        }
    }
}
