package sneakerhead;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.IntegrationTest;

/**
 * Created by wanghuiwu on 2016/4/12.
 */
public class TestString {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestString.class);
    @Test
    public void test1(){
        String aaa = "(2817982332,\"淘宝平台#否#wni2008#苏雨#####安徽省#淮南市#潘集区#VIP2#18655467584#949000948@qq.com#四心#98.46%#黄河路15号 \"小崔水暖\"##232000\")";
        if (aaa.contains("\"")){
            LOGGER.info("contains");
            String ccc = aaa.replaceAll("\"","\\\"");
            String ddd = aaa.replaceAll("淘宝","京东");
            String bbb = aaa.replace("\"","\\\"");
            LOGGER.info("replaceAll:{}",ccc);
            LOGGER.info("replace:{}",bbb);
            LOGGER.info("replacexxxx:{}",ddd);
        }else {
            LOGGER.info("not contains");
        }
    }


}

