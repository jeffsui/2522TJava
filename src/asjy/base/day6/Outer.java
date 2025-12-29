package asjy.base.day6;

public class Outer {
//    private static int number =100;
//    static class Inner{
//         static void inner(){
//             System.out.println("number="+number);
//        }
//    }
    private int number = 100;
    class Inner{
        void inner(){
            System.out.println("number="+number);
        }
    }

    public static void main(String[] args) {
//        Outer.Inner.inner();
//       Outer outer =  new Outer();
//      Inner inner = outer.new Inner();
//      inner.inner();
        new Outer().new Inner().inner();
    }
}
