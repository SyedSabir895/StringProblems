import java.util.*;
public class StringReverse{
    public static String Reverse(String s){
        String reversed = "";

        for(int i=s.length()-1;i>=0;i--)
        {
            reversed += s.charAt(i);
        }
        return reversed;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = Reverse(s);
        System.out.println(result);
        
        sc.close();
    }

}