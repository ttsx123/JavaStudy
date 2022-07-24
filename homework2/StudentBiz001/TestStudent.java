package StudentBiz001;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentBiz s = new StudentBiz();
        String name[] = new String[3];
        for (int i = 0; i < name.length; i++) {
            System.out.print("请输入第"+(i+1)+"个学生第姓名：");
            name[i] = input.next();
            s.addName(name[i]);
        }
        s.showName();
        s.searchName(1,3,"rr");
    }
}
