package StringReverse;

import java.util.Scanner;

public class Main {
    public static String ReturnArr(String original){
       char arr1[] = original.toCharArray();
       char arr2[] = new char[arr1.length];

       for(int i=0;i<arr1.length;i++){
        if(arr1[i] == ' '){
            arr2[i] = arr1[i];
        }
       }
       
       int j = arr2.length-1;

       for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=' '){
            if(arr2[j] == ' '){
                j--;
            }
            arr2[j] = arr1[i];
            j--;
        }
       }
       String reverse = new String(arr2);
       return reverse;

    }  

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
    String result = ReturnArr(s);
System.out.println(result);
sc.close();
    }
}
