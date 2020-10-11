package src.com.dingli.array;

public class Heroes {
    private String name;

    private double speed;

    private double blood;

    static String role;

    public Heroes() {
    }

    public void move() {
        int a = 10;
        System.out.println(name + "移动");
    }

    public static void fight(String message) {
        System.out.println("干架！！！！");
    }
}
