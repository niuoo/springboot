package sneakerhead.designpattern.decorator.better;

import sneakerhead.designpattern.decorator.SchoolReport;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    //告诉老爸学校的排名情况
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        reportSort();
        super.report();
    }
}
