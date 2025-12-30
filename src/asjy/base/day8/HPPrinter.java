package asjy.base.day8;

public class HPPrinter extends MyPrinter implements IPrinterNet{
    public HPPrinter(String brand, Ink ink, IPaper paper) {
        this.brand = brand;
        this.ink = ink;
        this.paper = paper;
    }

    @Override
    public void prepare()       {
        System.out.println(this.brand+"开始组装墨盒");
        ink.install();
        System.out.println(this.brand+"打印纸张");
        paper.print();
        this.printerNetwork();
        System.out.println(this.brand+"安装完毕");
    }

    @Override
    public void printerNetwork() {
        System.out.println(this.brand+"安装网络打印机驱动");
    }
}
