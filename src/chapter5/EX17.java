package chapter5;

class Test17{
    Test17(String str){
        System.out.println(str);
    }
}
public class EX17 {

    public static void main(String[] args) {
        Test17[] t = new Test17[10];
    }
    //未打印 因为未初始化 没有调用构造器
}
