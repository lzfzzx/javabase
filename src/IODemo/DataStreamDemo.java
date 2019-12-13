package IODemo;

import java.io.*;

/**
 * Created by Lzf on 2018/10/9.
 */
/*操作基本数据类型的流
操作基本数据类型

DataInputStream
DataOutputStream*/
public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
        // 写
        write();

        // 读
        read();
    }

    private static void read() throws IOException {
        // DataInputStream(InputStream in)
        // 创建数据输入流对象
        DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));

        // 读数据
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        char c = dis.readChar();
        boolean bb = dis.readBoolean();

        // 释放资源
        dis.close();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bb);
    }

    private static void write() throws IOException {
        // DataOutputStream(OutputStream out)
        // 创建数据输出流对象
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));

        // 写数据
        dos.writeByte(10);
        dos.writeShort(100);
        dos.writeInt(1000);
        dos.writeLong(10000);
        dos.writeFloat(12.34F);
        dos.writeDouble(12.56);
        dos.writeChar('a');
        dos.writeBoolean(true);

        // 释放资源
        dos.close();
    }
}
