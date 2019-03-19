package love.programming;

public class StringDemo3 {
    public static void main(String[] args) {
        String str ="Welcome";
        String str2 ="Welcome";
        String str3 = new String("welcome");

        System.out.println(str==str2);
        System.out.println(str==str3);
        System.out.println(str.equals (str3));

    }
}
