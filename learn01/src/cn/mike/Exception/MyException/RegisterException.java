package cn.mike.Exception.MyException;
/*
* 自定义异常类
* 格式：
*   public class XXXException extends Exception | RuntimeException{
*       添加一个空参数的构造方法
*       添加一个带异常信息的构造方法
*   }
* 注意：
*   1. 自定义异常类一般都Exception结尾
*   2. 必须继承Exception或者RuntimeException
*       如果继承Exception，则是编译期异常，必须处理要么throw要么try...catch
*       继承RuntimeException: 自定义的异常类就是一个运行期异常，无需处理，交给虚拟机处理*/
public class RegisterException extends RuntimeException{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
