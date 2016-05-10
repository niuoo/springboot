package sneakerhead.designpattern.strategy;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class SecondStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
