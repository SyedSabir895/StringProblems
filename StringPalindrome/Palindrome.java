import java.util.*;
public class Palindrome{
    public static boolean CheckPalin(String s){
        String reverse = "";
        for(int i=s.length()-1;i>=0;i--){
            reverse +=s.charAt(i);
        }
        if(s.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Boolean result = CheckPalin(s);
        System.out.println(result);
        sc.close();
    }
}