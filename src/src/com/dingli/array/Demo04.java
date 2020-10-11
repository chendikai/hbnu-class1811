package src.com.dingli.array;

import java.util.Scanner;

/**
 * 相亲问题
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        double wealth = scanner.nextDouble();
        boolean appearance = scanner.nextBoolean();

        if (height > 180 && wealth > 10000000 && appearance == true) {
            System.out.println("直接嫁了！！！");
        } else if (height > 180 || wealth > 10000000 || appearance == true) {
            System.out.println("勉强嫁了！！！！");
        } else {
            System.out.println("不嫁！！");
        }
    }
}
