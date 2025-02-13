import java.util.ArrayList;

public class Dash {
    public static ArrayList<Character> changingPlaces(ArrayList<Character> textArray) {
        System.out.println("New text array before: " + textArray.size());// ToDo Delete
        if ((textArray.get(0) == '-') || (textArray.get(textArray.size() - 1) == '-')) {
            System.out.println("Невозможно поменять символы местами, так как символ '-' является первым или последним элементом строки.");
        } else {
            for (int i = 1; i < textArray.size() - 1; i++) {// ToDo Не будет работать, если '-' будет первым или последним символом. Нужны исключения?
                if (textArray.get(i) == '-') {
                    char tempBefore = textArray.get(i - 1);
                    char tempAfter = textArray.get(i + 1);
                    textArray.set(i + 1, tempBefore);
                    textArray.set(i - 1, tempAfter);
                    textArray.remove(i);
                }
            }// for
        }
        System.out.println("New text array after: " + textArray.size());// ToDo Delete
        return textArray;
    }
}// class
