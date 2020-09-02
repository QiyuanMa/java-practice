package cn.mike.learn01.demo12;
/*方法覆盖注意事项：
1. 必须保证父子类之间的方法名称相同，参数列表相同
@Override：写在方法前面，用来检测是不是有效的正确覆盖重写(可选的安全检测手段)
2. 子类方法的返回值必须小于等于父类方法的返回值范围(比如String是Object的子类)
3. 子类权限必须【大于等于】父类方法的权限修饰符
public > protected > (default) > private
*/
public class Demo01Override {
}
