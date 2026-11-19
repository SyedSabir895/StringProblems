package CountVowelsandConsonants;
import java.util.*;
public class Count {
    public static void getCount(String s){
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        getCount(s);
    }
}
