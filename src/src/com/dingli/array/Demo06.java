package src.com.dingli.array;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 */
public class Demo06 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10000000) + 1;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = 0;

            try {
                number = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("您的脾气过于暴躁，不适合玩智力游戏，建议玩俄罗斯方块！！！");
                break;
            }

            if (number > num) {
                System.out.println("您猜的数据过大");
            } else if (number < num) {
                System.out.println("您猜的数据过小");
            } else {
                System.out.println("恭喜你猜对了！！！");
                break;
            }
        }
    }
}
