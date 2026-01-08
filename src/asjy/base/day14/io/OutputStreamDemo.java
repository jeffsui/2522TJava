package asjy.base.day14.io;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(new File("src/asjy/base/day14/io/note.bak.txt"));
            String words=  new String("爱上教育\n");
            outputStream.write(words.getBytes("utf-8"));
            outputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
