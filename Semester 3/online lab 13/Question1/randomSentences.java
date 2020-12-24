import java.util.Random;

public class randomSentences {

    private static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {

            StringBuilder sentence = new StringBuilder(article() + " " + noun() + " " + verb() + " " + preposition()
                    + " " + article() + " " + noun() + ".");
            sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));
            System.out.println(sentence);

        }
    }

    public static String article() {
        String[] articlStrings = new String[] { "the", "a", "one", "some", "any" };

        return articlStrings[random.nextInt(5)];
    }

    public static String noun() {
        String[] nounStrings = new String[] { "boy", "girl", "dog", "town", "car" };

        return nounStrings[random.nextInt(5)];

    }

    public static String verb() {
        String[] verbStrings = new String[] { "drove", "jumped", "ran", "walked", "skipped" };

        return verbStrings[random.nextInt(5)];
    }

    public static String preposition() {
        String[] prepoStrings = new String[] { "to", "from", "over", "under", "on" };

        return prepoStrings[random.nextInt(5)];

    }

}