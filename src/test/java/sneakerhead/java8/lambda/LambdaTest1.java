package sneakerhead.java8.lambda;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wanghuiwu on 2016/5/9.
 */
public class LambdaTest1 {

    @Test
    public void firstLambda(){
        Arrays.asList(1,2,3,4).forEach(i->System.out.println(i));
    }

    @Test
    public void secondLambda(){
        int b = 1000;//等同于final int b = 100,lambda内部会把局部变量定义为final，效率更高
        Arrays.asList(1,2,3,4).forEach(i->{
            i+=b;
            System.out.println(i);
        });
    }

    @Test
    public void thirdLambda(){
        List<Integer> list = Arrays.asList(1, 3, 2, 4);
        list.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println(list);
    }

    @Test
    public void forthLambda() throws NoSuchMethodException {

        //unTest
//        Method methods = LambdaTest1.class.getMethod("forthLambda",Object.class);
//        System.out.println(methods.getName());

        Method[] methods = LambdaTest1.class.getMethods();
        for (Method m:methods){
            System.out.println(m.getName());
        }
    }

    @Test
    public void fifthLambda(){
        List<Integer> list = Arrays.asList(1, 3, 2, 4);
        list.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println(list);
    }







}
