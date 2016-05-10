package sneakerhead.designpattern.factory;

import org.junit.Test;

import java.util.List;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class NvWa {

    @Test
    public void TestFactory(){
        System.out.println("来造个白人");
        HumanFactory.createHuman(WhiteHuman.class).talk();
        System.out.println("来造个黑人");
        HumanFactory.createHuman(BlackHuman.class).talk();
        System.out.println("来造个黄人");
        HumanFactory.createHuman(YellowHuman.class).talk();
        HumanFactory.createHuman(NvWa.class).talk();
    }

    @Test
     public void TestFactory2(){
        for (int i=0;i<9;i++){
            HumanFactory.createRandomHuman().talk();
        }

    }

    @Test
    public void TestFactory3(){
        List<Class> list = ClassUtils.getAllClassByInterface(Human.class);
        for (Class c:list){
            System.out.println(c.getName());
        }
    }
}
