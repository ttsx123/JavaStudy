package cn.banyuan;
public class zhaZhiJi {

//    public String zhaZhi(String fruit,int num){
//        String juice = fruit+"汁"+num+"份";
//        return juice;
//    }
//
//    public static void main(String[] args) {
//        zhaZhiJi z = new zhaZhiJi();
//        String juice =  z.zhaZhi("苹果",3);
//        System.out.println(juice);
//    }


    //最大值
    public int Max(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    //最小值
    int mini(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    //平均值
    int arg (int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return (sum/arr.length);
    }

    //冒泡排序
    int[] maopao (int[] arr){
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }




    public static void main(String[] args) {
        zhaZhiJi t = new zhaZhiJi();
        int a[] = {1,2,3,4,5};
        int b = t.Max(a);
        System.out.println(b);

        int c = t.mini(a);
        System.out.println(c);

        int d = t.arg(a);
        System.out.println(d);

        int e[] = {2,1,4,3,8,6};
        int []f = t.maopao(e);
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i]+" ");
        }
    }
}