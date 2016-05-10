package sneakerhead.java8.lambda;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Created by wanghuiwu on 2016/5/9.
 */
public class Base64Test {

    @Test
    public void test1(){
        String text = "sneakerhead is good!";
        String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        String decoded = new String(Base64.getDecoder().decode(encoded),StandardCharsets.ISO_8859_1);
        System.out.println(encoded);
        System.out.println(decoded);

    }
}
