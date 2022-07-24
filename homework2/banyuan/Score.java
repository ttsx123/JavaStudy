package cn.banyuan;

import java.util.Scanner;

public class Score {
    Scanner input = new Scanner(System.in);
    public void JavaScore(){
        double sum;
        double arg;
        System.out.print("请输入java成绩：");
        double JavaF = input.nextDouble();
        System.out.print("请输入C#成绩：");
        double cJingF = input.nextDouble();
        System.out.print("请输入Db成绩：");
        double DBf = input.nextDouble();
        sum = JavaF+cJingF+DBf;
        arg = sum/3;
        System.out.println("总分是"+sum);
        System.out.println("平均分是"+arg);
    }
    public static void main(String[] args) {
        Score one = new Score();
        one.JavaScore();

    }
}

