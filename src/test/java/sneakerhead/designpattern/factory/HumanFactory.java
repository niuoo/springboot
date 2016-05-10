package sneakerhead.designpattern.factory;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Random;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class HumanFactory {
    private static final Map<Integer,Class> map = Maps.newHashMap();
    static {
        map.put(0,WhiteHuman.class);
        map.put(1,YellowHuman.class);
        map.put(2,BlackHuman.class);
    }
    public static Human createHuman(Class c){
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须制定人种颜色");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("制定人种颜色未找到");
            e.printStackTrace();
        }
        return human;
    }

    public static Human createRandomHuman(){
        Human human = null;

        Random random = new Random();
        int i = random.nextInt(3);
        System.out.println("----------------"+i);
        try {
            human = (Human) Class.forName(map.get(i).getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须制定人种颜色");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("制定人种颜色未找到");
            e.printStackTrace();
        }
        return human;
    }
}
