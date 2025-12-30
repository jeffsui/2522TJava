package asjy.base.day7.iter;

public class FiveGNetwork implements  INetwork,IBlueTooth{
    @Override
    public void sendMsg(String msg) {
        System.out.println("5G网络发送消息"+msg);
    }

    @Override
    public String receiveMsg() {
        return "5G网络接收消息";
    }

    @Override
    public void transformeWithBT() {
        System.out.println("5G网络支持蓝牙协议数据传输");
    }

    @Override
    public void broadcase4K() {
        System.out.println("5G网络支持4k高清视频播放");
    }
}
