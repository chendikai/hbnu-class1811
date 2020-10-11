package src.com.dingli.array;

import java.util.Scanner;

/*
 * 从键盘输入数据并存入数组中，然后将数组元素打印到控制台中
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 创建一个scanner类

        System.out.println("请您输入5个整数：");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("数组里的元素：");
        for (int i = 0; i < arr.length; i++) {
//            遍历最后一个元素，去掉空格
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
