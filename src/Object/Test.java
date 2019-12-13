package Object;

import java.lang.reflect.Field;

/**
 * Created by Lzf on 2018/9/26.
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Class cls = student.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i <fields.length ; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            System.out.println();

        }
    }
}
