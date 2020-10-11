package src.com.dingli.array;

import java.util.Scanner;

/**
 * 圆桌离开
 */
public class Dmeo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入玩游戏的人数：");
        int n = scanner.nextInt();
        System.out.println("请输入开始报数人的编号：");
        int k = scanner.nextInt();
        System.out.println("离开的报数：");
        int m = scanner.nextInt();

        int[] person = new int[n];
        int[] req = new int[n];

        for (int i = 0; i < n; i++) {
            int index = k;
            for (int j = 0; j < m; index++) {
                if (person[index % n] == 0) {
                    j++;
                }
            }
            person[(index - 1) % n] = 1;
            req[i] = (index - 1) % n;
            k = index % n;
        }
        System.out.println("出圈人的编号：");
        for (int a: req) {
            System.out.print(a + " ");
        }
    }
}
