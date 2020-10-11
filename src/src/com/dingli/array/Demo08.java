package src.com.dingli.array;

import java.util.Scanner;

/**
 *  某年某月某日是一年当中多少天
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入年份：");
        int year = scanner.nextInt();

        System.out.println("请输入月份：");
        int month = scanner.nextInt();

        System.out.println("请输入日：");
        int day = scanner.nextInt();

        int count = 0;
        int days = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 11:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 10:
                case 12:
                    days = 30;
                    break;
                case 2: {
                    if ((year % 100 != 0 && year % 4 == 0)
                            || (year % 100 == 0 && year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                }
                default:
                    break;
            }
            count += days;
        }
        System.out.println("这是" + year + "的第" + (count + day) + "天");

    }
}
