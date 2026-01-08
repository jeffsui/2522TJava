package asjy.base.day14.io;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("src/asjy/base/day14/io/note.txt"));
            byte[] buffer = new byte[1024];
            int length = -1;
            StringBuilder sb = new StringBuilder();
            do{
               length =  inputStream.read(buffer);
               if(length!=-1){
                   sb.append(new String(buffer,0,length));
               }
            }while(length!=-1);
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
