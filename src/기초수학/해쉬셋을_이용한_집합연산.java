package 기초수학;

import java.util.Arrays;
import java.util.HashSet;

public class 해쉬셋을_이용한_집합연산 {
    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(1);
        System.out.println("Set1 =" + set1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1 =" + set1);
        set1.remove(1);
        System.out.println("Set1 =" + set1);
        System.out.println(set1.size());
        System.out.println(set1.contains(2));


        // 교집합
        HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4, 5));
        HashSet b = new HashSet(Arrays.asList(2, 4, 6, 8, 10));
        a.retainAll(b);
        System.out.println("교집합" + a);

        // 합집합
        a.addAll(b);
        System.out.println("합집합" + a);

        // 차집합
        a.removeAll(b);
        System.out.println("차집합" + a);
    }
}



