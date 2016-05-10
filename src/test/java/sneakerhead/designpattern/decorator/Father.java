package sneakerhead.designpattern.decorator;

import org.junit.Test;
import sneakerhead.designpattern.decorator.better.DecoratorReport;
import sneakerhead.designpattern.decorator.better.SortDecorator;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public class Father {
    @Test
    public void testRealReport(){
        SchoolReport schoolReport = new FourthGradeReport();
        schoolReport.report();
        schoolReport.sign("老豆");
    }

    @Test
    public void testDecoratorReport(){
        SchoolReport schoolReport = new DecoratorFourthGradeReport();
        schoolReport.report();
        schoolReport.sign("老豆");
    }

    @Test
    public void testBetterDecoratorReport(){
//        SchoolReport schoolReport = new DecoratorReport(new SortDecorator(new FourthGradeReport()));
        SchoolReport schoolReport = new SortDecorator(new DecoratorReport(new FourthGradeReport()));
        schoolReport.report();
        schoolReport.sign("老豆");
    }
}
