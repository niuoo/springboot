package sneakerhead.designpattern.decorator.better;

import sneakerhead.designpattern.decorator.SchoolReport;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class DecoratorReport extends Decorator {
    public DecoratorReport(SchoolReport schoolReport) {
        super(schoolReport);
    }

    //我要汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
