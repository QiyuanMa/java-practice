package cn.mike.learn01.demo13;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();
//        System.out.println("显示号码");
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
