package asjy.base.day8;

public abstract class MyPrinter {
    public String brand;
    public Ink ink;//墨盒接口
    public IPaper paper; //纸张接口
    public MyPrinter(){

    }
    public MyPrinter(String brand,Ink ink,IPaper paper){
        this.brand = brand;
        this.ink = ink;
        this.paper = paper;
    }

    public abstract void prepare();
//    {
//        System.out.println(this.brand+"开始组装墨盒");
//        ink.install();
//        System.out.println(this.brand+"打印纸张");
//        paper.print();
//        System.out.println(this.brand+"安装完毕");
//    }


}
