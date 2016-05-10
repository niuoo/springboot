package sneakerhead.designpattern.strategy;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class Context {
    private IStrategy iStrategy;

    //锦囊
    public Context(IStrategy strategy) {
        this.iStrategy = strategy;
    }

    public void operate(){
        this.iStrategy.operate();
    }
}
