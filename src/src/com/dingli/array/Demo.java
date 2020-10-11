package src.com.dingli.array;

/**
 * 获取三个值中最大值
 */
public class Demo {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 160;
        int height3 = 180;

        int tempHeight = 0;
        tempHeight = height1 > height2 ? height1 : height2;
        tempHeight = tempHeight > height3 ? tempHeight : height3;

        System.out.println(tempHeight);

    }
}
