package chapter7;

class WithFinals {
    public void x() { System.out.println("WithFinals.f()"); }
    public void y() { System.out.println("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
   @Override
   public void x() {
       System.out.println("OverridingPrivate.f()");
   }
   @Override
   public void y() {
       System.out.println("OverridingPrivate.g()");
   }
}
class OverridingPrivate2 extends OverridingPrivate {
   @Override
   public void x() {
       System.out.println("OverridingPrivate2.f()");
   }
   @Override
   public void y() {
       System.out.println("OverridingPrivate2.g()");
   }
}

public class EX20 {

    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.x();
        op2.y();
        OverridingPrivate op = op2;
        op.x(); op.y();
        WithFinals wf = op2;
        wf.x(); wf.y();
    }

} /* Output
OverridingPrivate2.f()
OverridingPrivate2.g()
OverridingPrivate2.f()
OverridingPrivate2.g()
OverridingPrivate2.f()
OverridingPrivate2.g()
*///:~
