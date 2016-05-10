package sneakerhead.designpattern.decorator;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class FourthGradeReport extends SchoolReport {
    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println("  ......");
        System.out.println("  语文 62  数学65 体育 98  自然  63");
        System.out.println("  .......");
        System.out.println("               家长签名：       ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名"+ name);
    }
}
