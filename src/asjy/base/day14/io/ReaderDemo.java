package asjy.base.day14.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("e:/note.txt");
            //reader 常用方法
            char[] buffer = new char[1024];
            int length = - 1;
            int count = 0;
            StringBuilder sb = new StringBuilder();
            do{
                length = reader.read(buffer);
                if(length!=-1){
                    sb.append(buffer,0,length);
                }
                count++;

            } while(length!=-1);
            System.out.println("读了"+count+"次");
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
