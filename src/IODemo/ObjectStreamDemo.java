package IODemo;

import java.io.*;

/**
 * Created by Lzf on 2018/10/9.
 */
/*序列化流
序列化流
ObjectOutputStream
反序列化流
ObjectInputStream
  序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。对象 –> 流数据(ObjectOutputStream)
  反序列化流:把文本文件中的流对象数据或者网络中的流对象数据还原成对象。流数据 –>对象(ObjectInputStream)
*/
//我们先写一个实体类，并实现序列化接口
class Person implements Serializable {

    private String name;

    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

//写入数据
//public class ObjectStreamDemo {
//    public static void main(String[] args) throws IOException{
//        // 创建序列化流对象
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
//
//        // 创建对象
//        Person p = new Person("阿杜", 25);
//
//        // public final void writeObject(Object obj)
//        oos.writeObject(p);
//
//        // 释放资源
//        oos.close();
//    }
//}
//读取数据
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // 创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "oos.txt"));

        // 还原对象
        Object obj = ois.readObject();

        // 释放资源
        ois.close();

        // 输出对象
        System.out.println(obj);
    }
}

/*输出结果：Person [name=阿杜, age=25]
  我们也可以这样理解
  对象序列化是将对象状态转换为可保持或传输的过程。一般的格式是与平台无关的二进制流，可以将这种二进制流持久保存在磁盘上，
  也可以通过网络将这种二进制流传输到另一个网络结点。
  对象反序列化，是指把这种二进制流数据还原成对象。*/