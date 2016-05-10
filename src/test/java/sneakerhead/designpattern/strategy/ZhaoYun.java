package sneakerhead.designpattern.strategy;

import org.junit.Test;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class ZhaoYun {
    @Test
    public void testStrategy(){
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context = new Context(new FirstStrategy()); //拿到妙计
        context.operate();  //拆开执行
        System.out.println("\n");

        //刘备乐不思蜀了，拆第二个了
        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new SecondStrategy());
        context.operate();  //执行了第二个锦囊了
        System.out.println("\n");

        //孙权的小兵追了，咋办？拆第三个
        System.out.println("-----------孙权的小兵追了，咋办？拆第三个 -------------");
        context = new Context(new ThirdStrategy());
        context.operate();  //孙夫人退兵
        System.out.println("\n");
    }

}
