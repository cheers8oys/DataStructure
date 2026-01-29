package 기초수학.경우의수;

// 약수 구하기, 두 수의 최대공약수와 최소공배수 구하기
// 활용) 1~10의 수 중 A의 약수 또는 B의 약수인 경우의 수
// 활용) 1~10의 수 중 A의 약수이면서 B의 약수인 경우의 수


import java.util.ArrayList;

public class 경우의수_활용 {

    public ArrayList getDivisor(int num) {
        ArrayList result = new ArrayList();

        for (int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
                result.add(i);
            }
        }
        result.add(num);
        return result;
    }

    public int getGCD(int numA, int numB) {
        int gcd = -1;

        ArrayList divisorA = getDivisor(numA);
        ArrayList divisorB = getDivisor(numB);

        for (int itemA : (ArrayList<Integer>) divisorA) {
            for (int itemB : (ArrayList<Integer>) divisorB) {
                if (itemA == itemB) {
                    if (itemA > gcd) {
                        gcd = itemA;
                    }
                }
            }
        }
        return gcd;
    }

    public int getLCM(int numA, int numB) {
        int lcm = -1;

        int gcd = getGCD(numA, numB);
        if(gcd != -1){
            lcm = numA * numB / gcd;
        }
        return lcm;
    }

    public static void main(String[] args) {
        경우의수_활용 a = new 경우의수_활용();
        System.out.println(a.getDivisor(12));
        System.out.println(a.getGCD(10, 12));
        System.out.println(a.getLCM(4, 12));

    }

}
