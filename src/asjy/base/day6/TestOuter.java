package asjy.base.day6;

public class TestOuter {
    public static void main(String[] args) {
//        Outer.Inner.inner();
        Outer outer =  new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.inner();
    }
}
