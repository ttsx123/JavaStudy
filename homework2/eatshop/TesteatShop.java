package eatshop;

import java.util.Scanner;

public class TesteatShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎使用吃货商场系统");
        eatShop eat = new eatShop();
        int m ;
        int d ;
        boolean isExit = false;
        do {
            d = 1;
            eat.zhuYe();
            m = input.nextInt();
            switch (m){
                case 1:
                    eat.order();
                    break;
                case 2:
                    eat.check();
                    break;
                case 3:
                    eat.qianShou();
                    break;
                case 4:
                    eat.delete();
                    break;
                case 5:
                    eat.dianZan();
                    break;
                case 6:
                    System.out.println("**退出系统**");
                    isExit = true ;
                    break;
            }
            if (!isExit){
                System.out.print("输入0返回（若输入其他数则结束系统）：");
                d = input.nextInt();
            }
        }while (d==0);
    }
}
