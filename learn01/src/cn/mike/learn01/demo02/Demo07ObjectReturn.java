package cn.mike.learn01.demo02;

public class Demo07ObjectReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
    }
    public static Phone getPhone(){
        Phone phone = new Phone();
        phone.brand = "苹果";
        phone.color = "yellow";
        phone.price = 3000;
        return phone;
    }
}
