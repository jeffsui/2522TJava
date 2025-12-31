package asjy.base.day9;

public class PackageDemo {
    public static void main(String[] args) {
        /**
         *       对应 基本类型
         * byte short int long  float double char boolean
         * Byte  Short Integer Long  Float  Double Character Boolean
         *       字符串类型转化: 将字符串转成对应的基本类型
         *       Integer.parseInt
         *       Float.parseFloat
         *       Double.parseDouble
         *  tips:
         *      null 和 "" 转化的时候,都会报异常
         *  Character 有一些独特方法
         */
        Integer iNum = new Integer(10);
        System.out.println(iNum.toString());
        int num = iNum.intValue();
        System.out.println(num);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        String strNum = "123";
        int numValue = Integer.parseInt(strNum);
        System.out.println(numValue);
        System.out.println("==============");
        String str11 = "11";
        System.out.println(Integer.parseInt(str11));
        System.out.println("===============");
        String str2 = "1234";
        Integer num4 = Integer.valueOf(str2);
        Integer num2 = new Integer(100);
        Integer num3 = new Integer(100);
        System.out.println("new Integer 对象比较"+(num2==num3));
        Integer num7 = Integer.valueOf(100);
        Integer num8 = Integer.valueOf(100);
        System.out.println("Integer.valueOf 对象比较（-128-127)缓存 如果有直接命中:"+(num7==num8));
        Integer num5 = Integer.valueOf(1234);
        Integer num6 = Integer.valueOf(1234);
        System.out.println("Integer.valueOf 对象比较"+(num5 == num6));
         //包装器类型 自动 装箱 拆箱
        Integer num1 = 100;
        int numNum = num1;

        Integer a = 1; //装箱
        a = a + 2;   // 拆箱   1+2=3  再装箱  Integer(3)

//        Integer b = null; //null 不能装箱 报空指针异常
//        b = b+1;

        System.out.println("=====Character使用==============");
        String str = "abc123op90m. +";
        char[] charArray = str.toCharArray();
        int letterNum= 0;
        int digitNum = 0;
        int spaceNum = 0;
        int otherCh = 0;
        for (int i = 0; i <charArray.length; i++) {
            if(Character.isLetter(charArray[i])){
                System.out.println("字母:"+charArray[i]);
                letterNum++;
            }else if(Character.isDigit(charArray[i])){
                System.out.println("数字:"+charArray[i]);
                digitNum++;
            }else if(Character.isSpaceChar(charArray[i])){
                System.out.println("空格:"+charArray[i]);
                spaceNum++;
            }else{
                System.out.println("其他字符:"+charArray[i]);
                otherCh++;
            }
        }
        System.out.printf("字母%d个,数字%d个,空格%d个,其他字符%d个",letterNum,digitNum,spaceNum,otherCh);

    }
}
