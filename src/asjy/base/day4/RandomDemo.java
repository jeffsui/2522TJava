package asjy.base.day4;

import java.sql.SQLOutput;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        /**
         * Math.random()
         *
         * 1-100 之间随机整数
         *
         */
        System.out.println(Math.random());
        int randNum = (int)(Math.random()*7);
        System.out.println(randNum);
//      Math.random() * (max - min + 1)
        System.out.println((int)(Math.random()*(10-1+1)));

        Random random = new Random();
        // nextInt(number) 0-number 随机整数
        System.out.println(random.nextInt(10));
//        rand.nextInt(max - min + 1) + min;
        System.out.println(random.nextInt(100-50+1)+50);


    }
}
