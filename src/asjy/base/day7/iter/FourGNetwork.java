package asjy.base.day7.iter;

public class FourGNetwork implements INetwork {
    @Override
    public void sendMsg(String msg) {
        System.out.println("4G网络发送"+msg);
    }

    @Override
    public String receiveMsg() {
        return "4G网络接收消息";
    }

    @Override
    public void broadcase4K() {
        try {
            Thread.sleep(2000);
            System.out.println("预加载后开始播放4K高清视频");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
