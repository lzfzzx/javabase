package CollectionFramework.SetPackage;

import java.util.Objects;

/**
 * Created by Lzf on 2018/9/30.
 */
/*
* 存储对象
* 如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
* */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

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

    public Student(){
        super();
    }
    public Student(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }
/*所以我们要在Student类中重写hashCode()和equals()这两个方法
这两个方法都是重写的，不用自己去写*/

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
//        主要条件 姓名的长度
        int num = this.name.length() - o.name.length();
//        姓名长度相同，不代表姓名的内容相同
        int num2 = num ==0 ? this.name.compareTo(o.name):num;
//        姓名长度和内容相同，不代表年龄相同，所以还得继续判断年龄
        int num3 = num2 ==0 ? this.age - o.age:num2;
        return num3;
    }
}
