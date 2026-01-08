package asjy.base.day14.io;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File srcFile = new File("E:/home/plan/thailand_plan.html");
        System.out.println("是否文件:"+srcFile.isFile());
        File srcFile2 = new File("E:/home/");
        System.out.println("是否文件夹:"+srcFile2.isDirectory());
        String[] list = srcFile2.list(); //文件列表 字符串形式
        for (String filePath: list){
            System.out.println(filePath);
        }
        File[] files = srcFile2.listFiles();
        for (int i = 0; i <files.length ; i++) {
            if(files[i].isDirectory()){
                System.out.println(files[i].getName()+":"+files[i].getAbsolutePath());
                File[] subFiles = files[i].listFiles();
                for (int j = 0; j < subFiles.length; j++) {
                    if(subFiles[i].isDirectory()){
                        System.out.println("  |--"+subFiles[i].getName());
                    }
                    if(subFiles[i].isFile()){
                        System.out.println("  |--"+subFiles[i].getName());
                    }
                }

            }
        }

    }
}
