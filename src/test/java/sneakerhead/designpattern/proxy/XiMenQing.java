package sneakerhead.designpattern.proxy;

import org.junit.Test;
import spock.lang.Specification;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class XiMenQing{
    @Test
    public void testProxy(){
        WangPo wangPo = new WangPo();
        wangPo.doSomeThing();
    }
}
