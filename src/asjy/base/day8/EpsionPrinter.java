package asjy.base.day8;

public class EpsionPrinter extends MyPrinter{
    @Override
    public void prepare() {
        System.out.println(this.brand + "开始组装墨盒");
        ink.install();
        System.out.println(this.brand + "打印纸张");
        paper.print();
        System.out.println(this.brand + "安装完毕");
    }
}
