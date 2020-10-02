package cn.mike.Thread.Lambda.p1;
/*
*   定义一个厨子Cook接口，内含唯一的抽象方法makeFood*/
public interface Cook {
    /*
    * 1. 使用Lambda必须具有接口，且接口中有且仅有一个抽象方法 Runnable, Comparator
    *
    * 2. 与接口中方法的参数对应*/

    //定义无参数无返回值的方法makeFood
    public abstract void makeFood();
}
