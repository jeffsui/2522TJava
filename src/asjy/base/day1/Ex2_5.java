package asjy.base.day1;

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        /**
         *
         */
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e,res=0;

        a = input.nextInt();
        res += a;
        System.out.println("1个小朋友摘苹果数"+res);
        b = input.nextInt();
        res += b;
        System.out.println("2个小朋友摘苹果数"+res);
        c = input.nextInt();
        res += c;
        System.out.println("3个小朋友摘苹果数"+res);
        d = input.nextInt();
        res += d;
        System.out.println("4个小朋友摘苹果数"+res);
        e = input.nextInt();
        res += e;
        System.out.println("5个小朋友摘苹果数"+res);

    }
}
