package sneakerhead.designpattern.proxy;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class WangPo implements Women {
    //代理类，实现共同接口

    private Women women;

    public WangPo() {
        this.women = new PanjinLian();
    }

    public WangPo(Women women) {
        this.women = women;
    }

    @Override
    public void doSomeThing() {
        this.women.doSomeThing();
    }
}
