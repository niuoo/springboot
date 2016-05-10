package sneakerhead.designpattern.singleton;

import org.junit.Test;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class DaChen {

    @Test
    public void testSingleton(){
        Long start = System.currentTimeMillis();
        for (int i = 0;i<700;i++){
            HuangDi huangDi = HuangDi.getInstance();
            huangDi.huangDiInfo();
        }
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
