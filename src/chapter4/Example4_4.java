package chapter4;

public class Example4_4 {
    public static void main(String[] arg) {

        // 예제 4 - 4
        // 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.

        int sum = 0;
        int num = 1;
        do {
            if (num % 2 == 0) {
                sum -= num;
            } else {
                sum += num;
            }
            num += 1;
        } while (sum <= 100);

        System.out.println(num);
    }
}
