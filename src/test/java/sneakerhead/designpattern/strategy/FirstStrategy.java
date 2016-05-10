package sneakerhead.designpattern.strategy;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class FirstStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
