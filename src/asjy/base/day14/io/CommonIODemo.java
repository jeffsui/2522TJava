package asjy.base.day14.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonIODemo {
    public static void main(String[] args) {
        File srcFile = new File("E:/home/plan/thailand_plan.html");
        File dstFile = new File("d:/home/plan/thailand_plan.html");
        try {
            long begin = System.currentTimeMillis();
            FileUtils.copyFile(srcFile,dstFile); //一行代码搞定文件拷贝
            FileUtils.copyDirectory(srcFile,dstFile);
            long  end = System.currentTimeMillis();
            System.out.println("cost time :"+(end-begin));

            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
