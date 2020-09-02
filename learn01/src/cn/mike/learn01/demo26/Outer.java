package cn.mike.learn01.demo26;

/*定义类时的权限修饰规则
*1. 外部类： public/(default)
*2. 成员内部类：public / protected/ (default) / private
*3. 局部内部类：什么都不写 */
public class Outer {
    public void methodOuter() {
        class Inner { // 局部内部类，该类是定义在方法内部，只有当前所属方法才能使用。
            int num = 10;
            public void methodInner() {
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
