package sneakerhead.java8.lambda;

import org.junit.Test;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by wanghuiwu on 2016/5/9.
 */
public class JodaTest {
    @Test
    public void test1(){
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
    }

    @Test
    public void test2(){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);
        System.out.println(time);
    }
}
