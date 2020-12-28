import java.util.regex.*;

class RegexExample6 {
    public static void main(String args[]) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
        System.out.println(Pattern.matches("^[\\w\\d]{3,}$", "99"));// false ($ is not matched)
    }
}
