package com.dingli.practice;

import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();  // 将用户输入的字符串存入str中

        String[] s = str.split(" ");
        int[] num = new int[s.length];

        try {
            for (int i = 0; i < s.length; i++) {
                num[i] = Integer.parseInt(s[i]); // 将分割后的数组中的每一个元素转为整型数据
            }

            // 冒泡排序
            for (int i = 0; i < num.length - 1; i++) {
                for (int j = 0; j < num.length - 1 - i; j++) {
                    if (num[j] > num[j+1]) {
                        int temp  = num[j];
                        num[j] = num[j+1];
                        num[j+1] = temp;
                    }
                }
            }

            // 将整型数组中的元素添加到StringBuilder中
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < num.length; i++) {
                if (i == num.length - 1) {
                    stringBuilder.append(num[i]);
                    break;
                }
                stringBuilder.append(num[i] + " ");
            }

            System.out.println(stringBuilder.toString());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("你输入的数据中含有非数字字符串");
        }
    }
}
