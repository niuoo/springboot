package sneakerhead.java8.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by wanghuiwu on 2016/5/9.
 */
public class StreamTest {

    @Test
    public void test1(){
        List<Integer> list = Arrays.asList(1, 3, 2, 4);
        long b = list.stream().filter(aaa->(aaa%2==0)).count();
        System.out.print(b);
    }

    @Test
    public void test2(){
        List<Integer> list = Arrays.asList(1, 3, 2, 4);
        List b = list.stream().filter(aaa->(aaa%2==0)).collect(Collectors.toList());
        System.out.print(b);
    }


    @Test
    public void test3(){
        Integer a = 2;
        int b = 1;
        System.out.print(b+a);
    }



}
