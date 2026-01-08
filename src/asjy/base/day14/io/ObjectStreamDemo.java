package asjy.base.day14.io;

import java.io.*;

public class ObjectStreamDemo implements Serializable {

    private static final long serialVersionUID = -5482134784819702626L;

    public String getName() {
        return name;
    }

    private String name = ";烟云十六声";

    public static void serialize() throws IOException {
        ObjectStreamDemo objectStreamDemo = new ObjectStreamDemo();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("yanyun.out")));
        outputStream.writeObject(objectStreamDemo);
        outputStream.close();
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("yanyun.out")));
        ObjectStreamDemo objDemo = (ObjectStreamDemo) inputStream.readObject();
        System.out.println(objDemo.getName());
    }

    public static void main(String[] args) {
        try {
//            serialize();
            deserialize();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
