package Object;

/**
 * Created by Lzf on 2018/9/21.
 */
public class StudentTest  {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        System.out.println(student.hashCode());//356573597
        System.out.println(student.getClass().getName());//Object.Student
        System.out.println(student.toString());//Student{name='null', age=0}
        Student student1 = new Student("梅西",30);
        Student student2 = new Student("梅西",30);
        System.out.println(student1 == student2);//false
        Student student3 = student1;
        System.out.println(student1 == student3);//true
        System.out.println(student1.equals(student2));//false
        System.out.println(student1.equals(student3));//true
        Student student4 = new Student("Meci",30);
        System.out.println(student1.equals(student4));//false

        Student ss = new Student();
        ss.setName("mc");
        ss.setAge(27);
//        克隆学生对象
        Object object =ss.clone();
        Student ss1 = (Student) object;
        System.out.println(ss.getName()+"______"+ss.getAge());
        System.out.println(ss1.getName()+"______"+ss1.getAge());


    }
}

/*
==:
基本类型：比较的就是值是否相同
引用类型：比较的就是地址值是否相同
equals:
引用类型：默认情况下，比较的是地址值。
不过，我们可以根据情况自己重写该方法。一般重写都是自动生成，比较对象的成员变量值是否相同(可以看上面代码的举例)*/



