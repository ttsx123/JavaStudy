package StudentBiz002;

public class StudentBiz {
    Student[] students = new Student[10];
    public void addStu(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i]==null){
                students[i] = student;
                break;
            }
        }
    }
    public void showStu(){
        System.out.println("学生是：");
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null){
                students[i].show();
            }
        }
    }
}
