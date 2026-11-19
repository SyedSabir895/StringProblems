package ReplaceCharsInString;

import java.util.Scanner;

public class Main {
    public static String returnString(String str, char replaceLetter, char replaceWith){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            if(current == replaceLetter){
                result.append(current);}
        }
        return result.toString();
    }
    
    // String result = str.replace(replaceLetter, replaceWith);
    //     return result;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char replaceLetter = sc.nextLine().charAt(0);
        char replaceWith = sc.nextLine().charAt(0);
        System.out.println(returnString(s, replaceLetter, replaceWith));
    }
}
