package StudentBiz001;

public class StudentBiz {

    String names[] = new String[10];

    public void addName(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i]==null){
                names[i] = name;
                break;
            }
        }
    }

    void showName(){
        for (int i = 0; i < names.length; i++) {
            if (names[i]!=null){
                System.out.print("学生的名字：");
                System.out.print(names[i]);
            }
        }
    }

    boolean isFind=false ;
    boolean searchName(int star,int end,String name2){
        for (int i = star-1; i <end-1 ; i++) {
            if (names[i].equals(name2)){
                System.out.println("找到了！！");
                isFind = true;
                break;
            }
        }
        System.out.println("没找到！！");
        return !isFind;
    }



}
