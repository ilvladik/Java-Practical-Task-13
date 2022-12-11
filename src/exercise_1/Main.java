package exercise_1;

public class Main {

    public static void main(String[] args) {
        String str = getString("I like Java!!!");
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0, 7));
    }

    public static String getString(String str) {
        return str;
    }
}
