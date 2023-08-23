package challengeCh8;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println(now);

    String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
    String[] noonName = {"오전", "오후"};
    Calendar c = Calendar.getInstance();
    System.out.println(c);

    int year = c.get(c.YEAR);
    int month = c.get(c.MONTH)+1;
    int day = c.get(c.DATE);
    System.out.println(year + "년 " + month + "월 " + day + "일");

    int hour = c.get(c.HOUR);
    int minute = c.get(c.MINUTE);
    int second = c.get(c.SECOND);
    System.out.println(hour + "시 " + minute + "분 " + second + "초");

    int am_pm = c.get(c.AM_PM);
    System.out.println(am_pm);
    int dayOfWeek = c.get(c.DAY_OF_WEEK);
    String week = weekName[dayOfWeek-1];
    String noon = noonName[am_pm];
    System.out.println(week + "요일 " + noon);
  }
}
