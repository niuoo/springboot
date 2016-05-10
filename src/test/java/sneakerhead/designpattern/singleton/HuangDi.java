package sneakerhead.designpattern.singleton;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class HuangDi {
    private static HuangDi huangDi = new HuangDi();

    private HuangDi() {
    }

    public synchronized static HuangDi getInstance(){
        return huangDi;
    }

    public static void huangDiInfo(){
        System.out.println("我是皇帝:朱元璋" + huangDi.hashCode());
    }
}
