package test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Lzf on 2019/12/3.
 */
public class Test {

    public static void main(String[] args) {
        List<PersonInfo> buildPersonInfoList = new ArrayList<>();
        List<PersonInfo> personInfoList = getPersonInfo();
        System.out.println("排序前=" + personInfoList.toString());
        Map<Integer, List<PersonInfo>> matchsListMap = personInfoList.stream()
                .collect(Collectors.groupingBy(PersonInfo::getAge));

        Integer i = 1;
        Integer j = 1;
        int count = 0;
        for (Map.Entry<Integer, List<PersonInfo>> entry : matchsListMap.entrySet()) {
            count++;
            Integer mapKey = entry.getKey();
            List<PersonInfo> ls = entry.getValue();
//            BigDecimal totalQuantity = ls.stream().map(PersonInfo::getAge).reduce(BigDecimal.ZERO, BigDecimalUtils::sum);
            System.out.println(mapKey + ":" + ls);
//            for (PersonInfo personInfo : ls) {
//                PersonInfo p = new PersonInfo();
////                BeanUtils.copyProperties(personInfo, p);
//                p.setSeq(j++);
//                buildPersonInfoList.add(p);
//            }
//            PersonInfo p = new PersonInfo();
//            p.setPersonName("我是分组" + i++);
//            buildPersonInfoList.add(p);
        }
        System.out.println(count);
        System.out.println("分组后=" + buildPersonInfoList.toString());


        Collections.sort(personInfoList, new Comparator<PersonInfo>() {//此处创建了一个匿名内部类
            // 这里比较age，降序就O2-O1，升序就O1-O2
            @Override
            public int compare(PersonInfo o1, PersonInfo o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("排序后=" + personInfoList.toString());
    }

    private static List<PersonInfo> getPersonInfo() {
        List<PersonInfo> personInfoList = new ArrayList<>();
        PersonInfo pi1 = new PersonInfo();
        pi1.setPersonId(1L);
        pi1.setAge(18);
        pi1.setPersonName("小明1");
        pi1.setSeq(1);
        personInfoList.add(pi1);

        PersonInfo pi2 = new PersonInfo();
        pi2.setPersonId(2L);
        pi2.setAge(18);
        pi2.setPersonName("小明2");
        pi2.setSeq(2);
        personInfoList.add(pi2);

        PersonInfo pi3 = new PersonInfo();
        pi3.setPersonId(3L);
        pi3.setAge(17);
        pi3.setPersonName("小明3");
        pi3.setSeq(3);
        personInfoList.add(pi3);

        PersonInfo pi4 = new PersonInfo();
        pi4.setPersonId(4L);
        pi4.setAge(19);
        pi4.setPersonName("小明4");
        pi4.setSeq(4);
        personInfoList.add(pi4);

        return personInfoList;
    }
}

