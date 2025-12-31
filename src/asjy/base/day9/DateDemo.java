package asjy.base.day9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateDemo {
    public static void main(String[] args) {
        Date date  = new Date();
        System.out.println(date.toString());
        System.out.println("时间戳(1970):"+date.getTime());
//        int year = date.getYear()+1900;
//        int month = date.getMonth()+1;
//        int dateNum = date.getDate();
//        int hour = date.getHours();
//        int min = date.getMinutes();
//        int sec = date.getSeconds();
//        System.out.printf("%d年%d月%d日 %d:%d:%d",year,month, dateNum,hour,min,sec);
        //jdk1.7之前 日期格式化方法
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate = format.format(date);
        System.out.println(formatDate);

        Calendar cl = Calendar.getInstance();
       int year =  cl.get(Calendar.YEAR);
        int month =  cl.get(Calendar.MONTH)+1;
        int day =  cl.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%d年%d月%d日\n",year,month,day);
        cl.add(Calendar.YEAR,1);
        System.out.println(cl.getTime());
        cl.add(Calendar.MONTH,-1);
        System.out.println(cl.getTime());

    }
}
