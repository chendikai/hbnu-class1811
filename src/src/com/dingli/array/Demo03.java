package src.com.dingli.array;

import java.util.Scanner;

/**
 * 加密
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] arr = new int[6];

//        int a1 = num % 10;
//        int a2 = num / 10 % 10;
//        int a3 = num / 10 / 10 % 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num / (int) Math.pow(10, i) % 10;
            arr[i] += 5;
            arr[i] %= 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
