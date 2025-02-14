import java.util.ArrayList;

public class Digits {
    public static ArrayList<Character> digitsProcessing(ArrayList<Character> sourceArray) {
        int number = 0;
        int digitInText;
        int digitsCounter = 0;
        for (int i = 0; i < sourceArray.size(); i++) {
            if (sourceArray.get(i) >= '0' && sourceArray.get(i) <= '9') {
                digitsCounter++;
                digitInText = sourceArray.get(i) - '0';
                number = number + digitInText;
                sourceArray.remove(i);
            }
        }

        if (digitsCounter > 0) {// ToDo Что делать, если в тексте будет только цифра 0?
            sourceArray.add(' ');
            String sumOfDigits = String.valueOf(number);
            char[] digitsOfSum = sumOfDigits.toCharArray();

            for (char chD : digitsOfSum) {
                sourceArray.add(chD);
            }
        }
        return sourceArray;
    }
}