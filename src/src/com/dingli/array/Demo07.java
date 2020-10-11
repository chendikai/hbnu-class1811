package src.com.dingli.array;

/**
 * 输出所有水仙花数
 */
public class Demo07 {
    public static void main(String[] args) {
        System.out.println("for循环实现的水仙花数：");
        flower_method1();
        System.out.println();

        System.out.println("while循环实现水仙花数：");
        flower_method2();
        System.out.println();

        System.out.println("do...while循环实现水仙花数：");
        flower_method3();
        System.out.println();
    }

    private static void flower_method3() {
        int i = 100;
        do {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.print(i + "\t");
            }
            ++i;
        } while (i < 1000);
    }

    /**
     *  while循环
     */
    private static void flower_method2() {
        int i = 100;
        while (i < 1000) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.print(i + "\t");
            }
            i++;
        }
    }

    /**
     *  for循环
     */
    private static void flower_method1() {
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.print(i + "\t");
            }
        }
    }
}
