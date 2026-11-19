import java.util.Scanner;

public class Main {
    public static String ReverseString(String str) {
        // char[] arr = str.toCharArray();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String usingStringBuilder(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static String usingRecursion(String s){
        if(s.isEmpty()){
            return s;
        }
        return usingRecursion(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String result = ReverseString(s);
        // String resultt = usingStringBuilder(s);
        // String resulttt = usingRecursion(s);
        // System.out.println(resulttt);
        System.out.println(s.charAt(0));
        
    }
}