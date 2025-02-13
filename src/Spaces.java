import java.util.ArrayList;

public class Spaces {

    public static ArrayList<Character> deleteSpaces(char[] text) {
        ArrayList<Character> textWithoutSpaces = new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            textWithoutSpaces.add(text[i]);
            if (text[i] == ' ') {
                for (int j = i + 1; j < text.length; j++) {
                    if (text[j] == ' ') {
                        continue;
                    }
                    textWithoutSpaces.add(text[j]);
                    i = j;
                    break;
                }
            }
        }
        return textWithoutSpaces;
    }
}
