package cn.mike.learn01.demo23;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

//        Mouse mouse = new Mouse();
        //#1向上转型作为参数
        System.out.println("# 1 ========");
        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        //#2不向上转型作为参数
        System.out.println("# 2 ========");
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);
        //#3匿名对象 不向上转型作为参数
        System.out.println("# 3 ========");
        computer.useDevice(new Keyboard());

        computer.powerOff();
    }
}
