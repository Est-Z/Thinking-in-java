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
    ����ʱ��ʼ���͹�������ʼ���Ĳ��죺��������ʱ��ʼ���Ĵ�����һ�Σ��������str1��
            ����������ʼ���Ĵ��������Σ����ȱ���������str2û�г�ʼ�����Զ�Ϊstr2��nullֵ��
            Ȼ���ڹ��췽���У��ٴγ�ʼ��;
*/
