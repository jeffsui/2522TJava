package asjy.base.day7.iter;

/**
 * 自定义网络接口
 */
public interface INetwork extends I4KVideo{
    public final  static String VER= "2.0";
    public abstract void sendMsg(String msg);
    public abstract String receiveMsg();
}
