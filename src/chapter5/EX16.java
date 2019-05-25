package chapter5;

import java.util.*;

public class EX16 {

    public static void main(String[] args) {
        Random rand = new Random(47);
        String[] s = new String[rand.nextInt(20)];
        for(int i = 0 ; i < s.length ; i++)
            s[i] = "str" + i;
        System.out.println(Arrays.toString(s));
    }

} /*
[str0, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10]
*///:~
