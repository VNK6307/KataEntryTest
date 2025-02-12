import java.util.ArrayList;
import java.util.List;

public class Spaces {

    public static void deleteSpaces(char[] text) {
        List<Character> textWithoutSpaces = new ArrayList<>();

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
        System.out.println(textWithoutSpaces);
    }
}
