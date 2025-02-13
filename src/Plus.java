import java.util.ArrayList;

public class Plus {
    public static ArrayList<Character> deletePluses(ArrayList<Character> inputText) {
        for (int i = 0; i < inputText.size() - 1; i++) {
            if (inputText.get(i) == '+') {
                inputText.remove(i);
            }
        }

        return inputText;
    }

}//class
