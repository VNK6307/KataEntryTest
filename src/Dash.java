import java.util.ArrayList;

public class Dash {
    public static ArrayList<Character> changePlaces(ArrayList<Character> textArray) {
        if ((textArray.get(0) == '-') || (textArray.get(textArray.size() - 1) == '-')) {
            System.out.println("Невозможно поменять символы местами, так как символ '-' является первым или последним элементом строки.");
        } else {
            for (int i = 1; i < textArray.size() - 1; i++) {
                if (textArray.get(i) == '-') {
                    char tempBefore = textArray.get(i - 1);
                    char tempAfter = textArray.get(i + 1);
                    textArray.set(i + 1, tempBefore);
                    textArray.set(i - 1, tempAfter);
                    textArray.remove(i);
                }
            }// for
        }
        return textArray;
    }
}