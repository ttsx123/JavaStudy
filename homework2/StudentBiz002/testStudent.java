package StudentBiz002;

public class testStudent {
    public static void main(String[] args) {
        StudentBiz stu = new StudentBiz();

        Student one = new Student();
        one.score = 19;
        one.age = 18;
        one.name = "zhangsan1";

        Student two = new Student();
        two.score = 99;
        two.age = 28;
        two.name = "zhangsan2";

        stu.addStu(one);
        stu.addStu(two);

        stu.showStu();
    }
}
