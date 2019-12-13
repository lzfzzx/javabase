package Object;

/**
 * Created by Lzf on 2018/9/21.
 */
public class Student implements Cloneable{
    private String name;
    private int age;

    public Student(){
        super();
    }
    public Student(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
   @Override
    public Object clone() throws CloneNotSupportedException{
        Object object = super.clone();
        return object;
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
}
