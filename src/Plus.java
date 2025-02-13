import java.util.ArrayList;

public class Plus {
    public static ArrayList<Character> deletePluses(ArrayList<Character> inputText) {
        for (int i = 0; i < inputText.size(); i++) {
            if (inputText.get(i) == '+') {
                inputText.set(i, '!');
            }
        }
        return inputText;
    }
}//class
