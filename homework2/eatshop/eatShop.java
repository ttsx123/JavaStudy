package eatshop;

import java.util.Scanner;

public class eatShop {
    //订餐人
    String names[]= new String[4];
    //订餐信息
    String dishMegs[] = new String[4];
    //时间
    int times[] = new int[4];
    //地址
    String address[] = new String[4];
    //状态
    int status[] = new int[4];//0:完成 1：预定
    //价格
    double prices[] = new double[4];

    //声明菜单数组
    //菜名
    String dishMeg[] = {"红烧带鱼","西红柿炒蛋","剁椒鱼头"};
    //价格
    double price[] = {38,22,56};
    //点赞数量
    int zan[] = new int[4];
    public void chuShiHua(){
        names[0] = "张三";
        dishMegs[0] = "鱼香肉丝";
        times[0] = 12;
        address[0] = "半圆";
        status[0] = 1;
        prices[0] = 13;

        names[1] = "李四";
        dishMegs[1] = "西红柿炒鸡蛋";
        times[1] = 12;
        address[1] = "教室";
        status[1] = 0;
        prices[1] = 15;
    }
    //isMan代表菜单是否满了，我们给他的默认值是没有。
    boolean isMan = false;
    //定义一个名为isFind的布尔值，默认为false就是找不到编号，如果for中找到了合适的值；则将其赋值ture
    boolean isFind = false;
    //定义布尔值，用来判断case4中如果找不到用户输入数据的情况。
    boolean isDel = false;

    public void order(){
        Scanner input = new Scanner(System.in);
        System.out.println("**我要订餐**");
        for (int i=0;i<names.length;i++){
            //这里需要判断name数组里的满足有没有溢出，如果没有才可以继续
            if (names[i]==null){
                isMan = true;
                System.out.print("请输入订餐人姓名：");
                String name = input.next();
                //遍历菜单
                System.out.println("序号\t菜品\t单价(元)\t点赞数");
                for (int j=0;j<dishMeg.length;j++){
                    //输出菜单
                    System.out.println((j+1)+"\t"+dishMeg[j]+"\t"+price[j]+"\t"+zan[j]);
                }
                System.out.print("请选择菜品编号：");
                int caiBianHao = input.nextInt();
                //dish为菜名字
                String dish = dishMeg[caiBianHao-1];

                //填写份数
                System.out.print("份数：");
                int fenShu = input.nextInt();

                //计算价格有两个1：菜价2：运输费
                double pri = price[caiBianHao-1];
                double p = pri>50 ? 0 : 5;

                //送餐时间
                System.out.println("送餐时间（10~20点）");
                int time = input.nextInt();
                while (time<10 || time>20){
                    System.out.println("sorry,不在送餐时间内，重新输入：");
                    //重新输入
                    time = input.nextInt();
                }

                //地址的输入
                System.out.println("地址：");
                String addre = input.next();
                System.out.println("订餐成功");

                //输出填写的菜单信息
                System.out.println("您定的是："+dish+fenShu+"份");
                System.out.println("送餐时间是："+time+"时");
                System.out.println("总费用为："+pri+"快递费为："+p+"总计："+(pri+p)+"元");

                //将点单信息添加到餐代数组中
                names[i] = name;
                dishMegs[i] = dish;
                times[i] = time;
                //默认给1为已预定
                status[i] = 1;
                address[i] = addre;
                prices[i] = pri+p;
                break;
            }
        }
        //判断如果满了，这里isMan的默认值为false 则取反
        if (!isMan){
            System.out.println("不好意思，餐袋已满");
        }
    }

    public void check(){
        Scanner input = new Scanner(System.in);
        System.out.println("**查看餐代**");
        System.out.println("序号\t订餐人\t餐品信息\t送餐日期\t地址\t总金额\t状态");
        //遍历names数组
        for (int i=0;i<names.length;i++){
            if (names[i]!=null){
                //打印餐代内容
                String time = times[i]+"时";
                String pric = prices[i]+"时";
                String sta = status[i]==0?"已完成":"已预定";
                System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+time+"\t"+address[i]+"\t"+pric+"\t"+sta+"\t");
            }
        }
    }

    public void qianShou(){
        Scanner input = new Scanner(System.in);
        System.out.println("**签收订单**");
        System.out.println("请输入需要签收的订单序号：");
        int qianShou = input.nextInt();
        //遍历names数组找到所有订单的信息判断订单状态输出相应语句
        for (int i=0;i<names.length;i++){
            //判断name不为空，且状态是预约状态，并且和输入的签收单号一致
            if (names[i]!=null && status[i]==1 && qianShou == i+1){
                isFind = true;
                status[i] = 0;
                System.out.println("签收完成");
                //else if用来判断订单状态为已签收
            }else if(names[i]!=null && status[i]==0 && qianShou == i+1){
                isFind = true;
                System.out.println("已经签收不可重复签收");
            }
        }
        if (!isFind){
            System.out.println("不好意思 没找到您需要签收的订单");
        }
    }

    public void delete(){
        Scanner input = new Scanner(System.in);
        System.out.println("**删除订单**");
        System.out.println("请输入删除订单的序号：");
        int del = input.nextInt();
        //遍历数组的内容
        for (int i = 0;i<names.length;i++){
            //判断删除条件，必须是有值，且状态为未完成，且下标要和输入的del-1相对应！
            if (names[i]!=null && status[i]==0 && del==i+1){
                //进入if循环就代表已经找到数据了则将isdel赋值为true
                isDel = true;
                //删除：从输入的del-1的下标开始到末尾结束length-1
                for (int j=del-1;j<names.length-1;j++){
                    //将被删除数据的下一个数据挪到被删除数据的下标空间中
                    names[j]=names[j+1];
                    dishMegs[j]=dishMegs[j+1];
                    times[j]=times[j+1];
                    address[j]=address[j+1];
                    status[j]=status[j+1];
                    prices[j]=prices[j+1];
                }
                //数据转移结束后，出现倒数第二和倒数第一个数据是一样的，则需要将最后一个数据赋值为空。
                names[names.length-1]=null;
                dishMegs[names.length-1]=null;
                times[names.length-1]=0;
                address[names.length-1]=null;
                status[names.length-1]=0;
                prices[names.length-1]=0;
                System.out.println("删除成功！");
                break;
                //在else if 中需要判断数据状态为未完成时的情况
            }else if (names[i]!=null && status[i]==1 && del==i+1){
                isDel = true;
                System.out.println("订单还未完成！不能删除！");
                break;
            }
        }
        //判断如果没有找到则输出不存在
        if (!isDel){
            System.out.println("您需要删除的订单不存在");
        }
    }

    public void dianZan(){
        Scanner input = new Scanner(System.in);
        System.out.println("**我要点赞**");
        System.out.println("序号\t菜品\t单价（¥）\t点赞数\t");
        for (int j=0;j<dishMeg.length;j++){
            System.out.println((j+1)+"\t"+dishMeg[j]+"\t"+price[j]+"\t"+zan[j]+"\t");
        }
        System.out.println("请选择需要点赞商品的编号：");
        int n = input.nextInt();
        zan[n-1]++;
        System.out.println("点赞成功！！");
    }

    public void zhuYe(){
        System.out.println("*****************");
        System.out.println("1、我要订餐");
        System.out.println("2、查看餐代");
        System.out.println("3、签收订单");
        System.out.println("4、删除订单");
        System.out.println("5、我要点赞");
        System.out.println("6、退出系统");
        System.out.println("****************");
        System.out.print("请选择：");
    }

}
