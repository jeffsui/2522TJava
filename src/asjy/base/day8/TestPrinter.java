package asjy.base.day8;

public class TestPrinter {
    public static void main(String[] args) {
        //黑色墨盒 + A4打印纸
        Ink blackInk = new BlackInk();
        IPaper a4Paper= new A4Paper();
        MyPrinter printer = new HPPrinter("HP打印机",blackInk,a4Paper);
        printer.prepare();
    }
}
