package lambda;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Lzf on 2019/11/25.
 */
public class lambdatest {
    /*一、
     * 语法：()->{}
     * () : 括号就是接口方法的括号，接口方法如果有参数，也需要写参数。只有一个参数时，括号可以省略。
     * -> : 分割左右部分的
     * {} : 要实现的方法体。只有一行代码时，可以不加括号，可以不写return
     * 如果接口中有多个方法时，就无法使用lambda表达式，它只适用于函数型接口
     * 函数型接口：就是只有一个抽象方法的接口，这类接口对应的注解：@FunctionalInterface
     * JAVA8内置四大核心函数型接口：
     * 消费型接口（有参无返回值）
     * Consumer<T>
     * void accept(T t);
     * 供给型接口（无参有返回值）
     * Supplier<T>
     * T get();
     * 函数型接口（有参有返回值）
     * Function<T,R>
     * R apply(T t);
     * 断言型接口（有参有布尔返回值）
     * Predicate<T>
     * boolean test(T t);
     *
     * 还有两种简化代码的手段：
     * 1、方法引用
     * 如果我们要实现的接口的方法与另一个方法A参数类型与返回值类型类似
     * 我们直接声明A方法即可。也就是，不再使用lambda表达式的标准形式，改用高级形式。无论是标准形式还是高级形式，都是lambda表达式的一种表现形式
     * 例如：
     * Function functionA = (x) -> x;
     * Function functionB = String::valueOf;
     * 对比Function接口的抽象方法与String的value方法，可以看到它们是类似的。
     * R apply(T t);
     * public static String valueOf(Object obj){
     *   return (obj==null)?"null":obj.toString;
     * }
     * 方法引用的语法：
     * 对象::实例方法
     * 类::静态方法
     * 类::实例方法
     * 前两个很容易理解，相当于对象调用实例方法，类调用静态方法一样。只是第三个需要特殊说明。
     * 当出现如下情况时：
     * Compare<Boolean> c = (a,b)->a.equals(b)
     * 用lambda表达式实现Compare接口的抽象方法，并且方法体只有一行，且该行代码为参数1调用方法传入参数2。此时，就可以简化为下面这种形式：
     * Compar<Boolean> c = String::euqals;
     * 也就是“类::实例方法”形式
     * 值得一提的是，当参数b不存在时，该方式依旧适用。例如：
     * Function function1 = (x) ->x.toString();
     * Function function2 = Object::toString;
     *
     * 2、构造引用
     * 先创建一个供给型接口对象：
     * Supplier<String> supplier = ()-> new String();
     *在这个lammbda表达式中只做了一件事，就是返回一个新的Test对象，而这种形式可以更简化：
     * Supplier<String> supplier =String::new;
     * 提炼一下构造引用的语法：
     * 类名::new
     * 当通过含参构造方法创建对象，并且参数列表与抽象方法的参数列表一致，也就是下面的这种形式：
     * Function1 function = (x)->new String(x);
     * 也可简化为:
     * Function1 function = String::new;
     * 特殊点的数组类型：
     * Function<Integer,String[]> function = (x) -> new String[x];
     * 可以简化为：
     * Function<Integer,String[]> function = String[]:new;
     *
     * 总结：
     * 上面并没有给出太多的lambda实例，只是侧重讲了如何去理解lambda表达式。到这里，不要懵。要记住lambda的本质：
     * 为函数型接口的匿名实现进行简化与更简化。
     * 所谓的简化就是lambda的标准形式，所谓的更简化是在标准形式的基础上进行方法引用和构造引用。
     * 方法引用是拿已有的方法去实现此刻的接口。
     * 构造引用是对方法体只有一句new Object()的进一步简化。
     *
     * 二、Stream
     * 1、如何理解Stream
     * Stream 不是集合元素,它不是数据结构并不保存数据，它是有关算法和计算的，它更像一个高级版本的 Iterator。
     * 简单来说，它的作用就是通过一系列操作将数据源（集合、数组）转化为想要的结果。
     * 2、Stream特点
     * Stream是不会存储元素的
     * Stream不会改变原对象，相反，他们会返回一个持有结果的新Stream
     * Stream操作是延迟执行的，意味着他们会等到需要结果的时候才执行
     * 3、生成Stream的方式
     * //Collection系的 stream() 和 parallelStream();
List<String> list = new ArrayList<>();
Stream<String> stream = list.stream();
Stream<String> stringStream = list.parallelStream();

//通过Arrays
Stream<String> stream1 = Arrays.stream(new String[10]);

//通过Stream
Stream<Integer> stream2 = Stream.of(1, 2, 3);

//无限流
//迭代
Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
iterate.limit(10).forEach(System.out::println);

//生成
Stream<Double> generate = Stream.generate(() -> Math.random());
generate.forEach(System.out::println);
     *
     * 4、Stream的中间操作
     * 多个中间操作连接而成为流水线，流水线不遇到终止操作是不触发任何处理的，所为又称为“惰性求值”
     *         list.stream()
                .map(s-s+1)   //映射
                .flatMap(s-> Stream.of(s)) //和map差不多，但返回类型为Stream，类似list.add()和list.addAll()的区别
                .filter(s->s<1000)  //过滤
                .limit(5)       //限制
                .distinct()     //去重
                .sorted()       //自然排序
                .sorted(Integer::compareTo) //自定义排序
     * 5、Stream的终止操作
     * list.stream().allMatch((x) -> x == 555); // 检查是否匹配所有元素
list.stream().anyMatch(((x) -> x>600)); // 检查是否至少匹配一个元素
list.stream().noneMatch((x) -> x>500); //检查是否没有匹配所有元素
list.stream().findFirst(); // 返回第一个元素
list.stream().findAny(); // 返回当前流中的任意一个元素
list.stream().count(); // 返回流中元素的总个数
list.stream().forEach(System.out::println); //内部迭代
list.stream().max(Integer::compareTo); // 返回流中最大值
Optional<Integer> min = list.stream().min(Integer::compareTo);//返回流中最小值
System.out.println("min "+min.get());
     *
     * reduce （归约）：将流中元素反复结合起来得到一个值
     *Integer reduce = list.stream()
        .map(s -> (s + 1))
        .reduce(0, (x, y) -> x + y);    //归约：0为第一个参数x的默认值，x是计算后的返回值，y为每一项的值。
System.out.println(reduce);

Optional<Integer> reduce1 = list.stream()
        .map(s -> (s + 1))
        .reduce((x, y) -> x + y);  // x是计算后的返回值，默认为第一项的值，y为其后每一项的值。
System.out.println(reduce);
     *
     * collect（收集）：将流转换为其他形式。需要Collectors类的一些方法。
     * //转集合
        Set<Integer> collect = list.stream()
                .collect(Collectors.toSet());

        List<Integer> collect2 = list.stream()
                .collect(Collectors.toList());

        HashSet<Integer> collect1 = list.stream()
                .collect(Collectors.toCollection(HashSet::new));
//分组 {group=[444, 555, 666, 777, 555]}
        Map<String, List<Integer>> collect3 = list.stream()
                .collect(Collectors.groupingBy((x) -> "group"));//将返回值相同的进行分组
        System.out.println(collect3);
         //多级分组 {group={777=[777], 666=[666], 555=[555, 555], 444=[444]}}
        Map<String, Map<Integer, List<Integer>>> collect4 = list.stream()
                .collect(Collectors.groupingBy((x) -> "group", Collectors.groupingBy((x) -> x)));
        System.out.println(collect4);

        //分区 {false=[444], true=[555, 666, 777, 555]}
        Map<Boolean, List<Integer>> collect5 = list.stream()
                .collect(Collectors.partitioningBy((x) -> x > 500));
        System.out.println(collect5);

        //汇总
        DoubleSummaryStatistics collect6 = list.stream()
                .collect(Collectors.summarizingDouble((x) -> x));
        System.out.println(collect6.getMax());
        System.out.println(collect6.getCount());

        //拼接 444,555,666,777,555
        String collect7 = list.stream()
                .map(s -> s.toString())
                .collect(Collectors.joining(","));
        System.out.println(collect7);

        //最大值
        Optional<Integer> integer = list.stream()
                .collect(Collectors.maxBy(Integer::compare));
        System.out.println(integer.get());
     * */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(5);
//        Integer reduce = list.stream()
//                .map(s -> (s + 1))
//                .reduce(0, (x, y) -> x + y);    //归约：0为第一个参数x的默认值，x是计算后的返回值，y为每一项的值。
//        System.out.println(reduce);
//        Optional<Integer> reduce1 = list.stream()
//                .map(s -> (s + 1))
//                .reduce((x, y) -> x + y);  // x是计算后的返回值，默认为第一项的值，y为其后每一项的值。
//        System.out.println(reduce);
//        根据返回值分组
        Map<String, List<Integer>> collect3 = list.stream()
                .collect(Collectors.groupingBy((x) -> "group"));//将返回值相同的进行分组
        System.out.println(collect3);
//多级分组
        Map<String, Map<Integer, List<Integer>>> collect4 = list.stream()
                .collect(Collectors.groupingBy((x) -> "group", Collectors.groupingBy((x) -> x)));
        System.out.println(collect4);
//分区
        Map<Boolean, List<Integer>> collect5 = list.stream()
                .collect(Collectors.partitioningBy((x) -> x > 5));
        System.out.println(collect5);
        //汇总
        DoubleSummaryStatistics collect6 = list.stream()
                .collect(Collectors.summarizingDouble((x) -> x));
        System.out.println(collect6.getMax());
        System.out.println(collect6.getCount());
        System.out.println(collect6.getSum());

        //拼接 444,555,666,777,555
        String collect7 = list.stream()
                .map(s -> s.toString())
                .collect(Collectors.joining(","));
        System.out.println(collect7);

        //最大值
        Optional<Integer> integer = list.stream()
                .collect(Collectors.maxBy(Integer::compare));
        System.out.println(integer.get());
        Object a = new Object();
        String b = "aaa";
//        b.equals()
    }
}
