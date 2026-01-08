package asjy.base.day14.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        System.out.println("当前工作路径"+System.getProperty("user.dir"));
        Writer writer = null;
        try {
            writer = new FileWriter("src/asjy/base/day14/io/note.txt",true);
            writer.write("爱尚"+"\n");
            writer.write("教育"+"\n");
            writer.write("重塑未来"+"\n");
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
