package sneakerhead.designpattern.decorator.better;

import sneakerhead.designpattern.decorator.SchoolReport;

/**
 * Created by wanghuiwu on 2016/5/6.
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
