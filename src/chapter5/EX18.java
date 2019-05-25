package chapter5;

class Test18{
    Test18(String str){
        System.out.println(str);
    }
}
public class EX18 {

    public static void main(String[] args) {
        Test18[] t = new Test18[5];
        for(int i = 0 ; i < t.length ; i++)
              t[i] = new Test18("str"+i);
    }

} /*
str0
str1
str2
str3
str4
*///:~
