package src.com.dingli.array;

import javax.swing.*;
import java.util.Scanner;

/**
 *  对数组中的元素进行排序
 */
public class Demo02 {
    public static void main(String[] args) {
        // 定义键盘录入
        Scanner scanner = new Scanner(System.in);

        // 将键盘录入数据存入数组
        System.out.println("请您输入5个数字：");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // 控制台显示
        System.out.println("排序前数据：");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);;
                break;
            }
            System.out.print(arr[i] + " ");
        }
        // 冒泡排序
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("排序后的数据：");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);;
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
