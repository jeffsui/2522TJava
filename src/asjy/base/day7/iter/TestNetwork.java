package asjy.base.day7.iter;

public class TestNetwork {
    public static void main(String[] args) {
        INetwork fiveGnet = new FiveGNetwork();
        fiveGnet.sendMsg("2026元旦快乐");
        fiveGnet.broadcase4K();
        System.out.println("网络协议版本:"+INetwork.VER);
//        INetwork.VER = "3.0";

        IBlueTooth fiveGnetBT = new FiveGNetwork();
        fiveGnetBT.transformeWithBT();



        INetwork fourGnet = new FourGNetwork();
        fourGnet.sendMsg("2026元旦快乐");
        fourGnet.broadcase4K();
    }
}
