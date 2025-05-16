 public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}

class Outer {
    int x = 10;
    class Inner {
        void show() {
            System.out.println("x = " + x);
        }
    }
}
