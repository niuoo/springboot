package sneakerhead.designpattern.decorator;

/**
 * Created by wanghuiwu on 2016/5/6.
 * 我上小学的时候学习成绩非常的差，班级上 40 多个同学，我基本上都是在排名 45 名以后，按照老师给我的定义就是“不是读书的料”，
 * 但是我老爸管的很严格，明知道我不是这块料，还是往赶鸭子上架，每次考试完毕我都是战战兢兢的，“竹笋炒肉”是肯定少不了的，能少点就少点吧，肉可是自己的呀。四年级期末考试考完，
 * 学校出来 个很损的招儿（这招儿现在很流行的），打印出成绩单，要家长签字，然后才能上五年级，我那个恐惧呀，不过也就是几秒钟的时间，玩起来什么都忘记了。
 */
public abstract class SchoolReport {
    //成绩单的主要展示的就是你的成绩情况
    public abstract void report();
    //成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
}
