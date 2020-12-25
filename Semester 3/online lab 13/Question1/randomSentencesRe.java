import java.util.Random;

public class randomSentencesRe {
    private static Random random = new Random();

    public static void main(String[] args) {
        String[] articlStrings = new String[]{" the ", " a ", " one ", " some ", " any "};
        String[] nounStrings = new String[]{" boy ", " girl ", " dog ", " town ", " car "};
        String[] verbStrings = new String[]{" drove ", " jumped ", " ran ", " walked ", " skipped "};
        String[] prepoStrings = new String[]{" to ", " from ", " over ", " under ", " on "};
        String[] sentences = new String[20];

        for (String sentence : sentences) {
            sentence = articlStrings[random.nextInt(5)].concat(
                    nounStrings[random.nextInt(5)]).concat(
                    verbStrings[random.nextInt(5)]).concat(
                    prepoStrings[random.nextInt(5)]).concat(
                    articlStrings[random.nextInt(5)]).concat(
                    nounStrings[random.nextInt(5)]).concat(".");
            char[] characters = sentence.toCharArray();
            characters[1] = Character.toUpperCase(characters[1]);

            sentence = String.valueOf(characters);
            System.out.println(sentence);
        }

    }


}
