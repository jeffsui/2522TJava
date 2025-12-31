package asjy.base.day9;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double d1 = 0.1;
        double d2= 0.2;
        System.out.println(d1+d2);
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal res = b1.add(b2);
        System.out.println(res);
        BigDecimal multiply = b1.multiply(b2);
        System.out.println(multiply);
        BigDecimal divide = b1.divide(b2);
        System.out.println(divide);
        BigDecimal subtract = b2.subtract(b1);
        System.out.println(subtract);

        //舍入 精度控制
        BigDecimal dividend = new BigDecimal("10");
        BigDecimal divisor  = new BigDecimal("3");

// 方式1：指定小数位数 + 舍入模式（推荐）
        BigDecimal result1 = dividend.divide(divisor, 6, RoundingMode.HALF_UP);
// → 3.333333

// 方式2：使用 MathContext（控制总有效位数）
        BigDecimal result2 = dividend.divide(divisor, new MathContext(10, RoundingMode.HALF_UP));
// → 3.333333333


    }
}
