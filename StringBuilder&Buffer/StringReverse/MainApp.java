package StringReverse;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
        m.ReturnArr(s);
        sc.close();
    }
}
