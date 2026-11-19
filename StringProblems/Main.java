package StringProblems;

public class Main {
    public static void main(String[] args) {
         String s1 = new String("Nigga");
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.indexOf(4));
        System.out.println(s1.length());
        System.out.println(s1.contains("s"));
        System.out.println(s1.substring(1,4));
        System.out.println(s1.startsWith("I"));
        System.out.println(s1.endsWith("z"));
        System.out.println(s1.lastIndexOf("g"));
        System.out.println(s1.isEmpty());


        String s2 = new String("Speed Nigga");
        System.out.println(s2.trim());
    }
   
}

