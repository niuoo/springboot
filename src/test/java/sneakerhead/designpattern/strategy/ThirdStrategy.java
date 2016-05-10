package sneakerhead.designpattern.strategy;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class ThirdStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
