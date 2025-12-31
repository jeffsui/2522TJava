package asjy.base.day9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {
    public static void main(String[] args) {
        /**
         * xxxx年-xx月-xx日
         */
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println(nowTime);
        //日期时间的差 月、 天、小时

        //日期偏移量
        LocalDate yesterday = nowDate.plusDays(-1);
        System.out.println("昨天是:"+yesterday);
        LocalDate oneMonthLater = nowDate.plusMonths(1);
        System.out.println("一个月以后:"+oneMonthLater);


        //指定日期
        LocalDate nameDate = LocalDate.of(2020,1,23);
        System.out.println(nameDate);
        //jdk1.8 日期格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatStr = formatter.format(nowTime);
        System.out.println(formatStr);


    }
}
