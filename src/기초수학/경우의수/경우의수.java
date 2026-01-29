package 기초수학.경우의수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 경우의수 {
    public static void main(String[] args) {

        //합의 법칙

        int[] dice1 = {1,2,3,4,5,6};
        int[] dice2 = {1,2,3,4,5,6};

        int nA = 0;
        int nB = 0;
        int nAandnB = 0;


        System.out.println("==합의 법칙==");
        //직접 구현
        for(int itemA : dice1){
            for(int itemB : dice2){
                if((itemA+itemB)%3==0) {
                    nA++;
                }
                if((itemA+itemB)%4==0) {
                    nB++;
                }
                if((itemA+itemB)%12==0) {
                    nAandnB++;
                }
            }
        }
        System.out.println(nA);
        System.out.println(nB);
        System.out.println(nAandnB);
        System.out.println("결과:" +(nA+nB-nAandnB));

        //해쉬셋 이용
        HashSet<ArrayList> a = new HashSet<>();

        for(int itemA : dice1) {
            for(int itemB : dice2) {
                if((itemA+itemB)%3 == 0 || (itemA+itemB)%4 == 0) {
                    ArrayList list = new ArrayList(Arrays.asList(itemA, itemB));
                    a.add(list);
                }
            }
        }
        System.out.println(a.toArray());
        System.out.println(a);
        System.out.println("결과: " +a.size());

        System.out.println("==곱의 법칙==");

        nA = 0;
        nB = 0;

        for(int itemA : dice1) {
            if (itemA % 3 == 0) {
                nA++;
            }
        }
        for (int itemB : dice2) {
            if (itemB % 4 == 0) {
                nB++;
            }
        }

        System.out.println(nA);
        System.out.println(nB);
        System.out.println("결과" +(nA * nB));
    }
}
