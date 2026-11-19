package StringLengthWithandWithoutMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // with built-in
        // int result = s.length();
        // System.out.println(result);

        // Without Built - In
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}