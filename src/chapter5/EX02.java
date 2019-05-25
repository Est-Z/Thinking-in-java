package chapter5;


public class EX02 {

    String str1 = "Initialization in the definition";
    String str2;
    String str3;
    
    EX02(){
        System.out.println(this.str1);
        System.out.println(this.str3);
        
        System.out.println(this.str2);
        this.str2 = "Initialization is in creation";
        System.out.println(this.str2);
    }
    public static void main(String[] args) {
        EX02 ex02 = new EX02();
        System.out.println(ex02.str1);
        System.out.println(ex02.str2);
        System.out.println(ex02.str3);
    }

} /*
Initialization in the definition
null
null
Initialization is in creation
Initialization in the definition
Initialization is in creation
null
*///:~

/*
    定义时初始化和构造器初始化的差异：变量定义时初始化的次数是一次，例如变量str1；
            而构造器初始化的次数是两次，首先编译器发现str2没有初始化，自动为str2赋null值，
            然后在构造方法中，再次初始化;
*/
