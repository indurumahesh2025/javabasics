package java_basics;

public class MyUtils {

    public static int add10(int x) {
        int result = x + 10;
        return result;
    }

    public int add20(int x) {
        int result = x + 20;
        return result;
    }

    protected static void sum2Numbers(int first, int second) {
        System.out.println(first + second);
        // return first + second; This will cause an error because the return type is void
    }


}
