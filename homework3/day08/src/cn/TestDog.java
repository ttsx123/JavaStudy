package cn;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dog wang = new dog();
        qie qi = new qie();
        System.out.println("欢迎来到宠物店：");
        System.out.println("请输入宠物昵称：");
        String iname = input.next();
        wang.name = iname;
        qi.name = iname;
        System.out.println("请输入宠物的类型：（1、狗狗   2、企鹅）");
        int num = input.nextInt();
        switch (num){
            case 1:
                System.out.println("请选择宠物的品种：（1、拉不来多  2、雪纳瑞）");
                int p = input.nextInt();
                if (p ==1){
                    wang.pinZhong = "拉不来多";
                    wang.show();
                }else if (p==2){
                    wang.pinZhong = "雪纳瑞";
                    wang.show();
                }
                break;
            case 2:
                System.out.println("请选择宠物的性别：（1、雄  2、雌）");
                int c = input.nextInt();
                if(c==1){
                    qi.sex="雄";
                    qi.show();
                }else if (c==2){
                    qi.sex="雌";
                    qi.show();
                }
                break;
            default:
                break;
        }

    }
}
