import java.util.ArrayList;

public class Input {
    public static void main(String[] args) {
        String targetText1 = "генрих играет! илюбитшколу 3";
        String targetText2 = "Я люблю джаву всем сердцем!";
        String targetText3 = "генрих играет! илюбитшколу 0";

        String input = "Ввее-дно   три пробела+";// ToDo Переделать на ввод из консоли  и добавить отображение введенного текста
        String modifiedText = textModifier(input);
        printResult(modifiedText);
        System.out.println();

        input = "Введено   дв -араза     по     пять   пробелов+";
        modifiedText = textModifier(input);
        printResult(modifiedText);
        System.out.println();

        input = "генрих1  играет+2   л-июбит0школу";
        modifiedText = textModifier(input);
        printResult(modifiedText);
        checkResult(modifiedText, targetText1);
        System.out.println();

        input = "Я ю-лбю-л джаву   всем сердцем+";
        modifiedText = textModifier(input);
        printResult(modifiedText);
        checkResult(modifiedText, targetText2);
        System.out.println();

        input = "генрих  играет+   л-июбит0школу";
        modifiedText = textModifier(input);
        printResult(modifiedText);
        checkResult(modifiedText, targetText3);

    }// main

    public static void printResult(String text) {
        System.out.println("Текст после всех изменений          - " + text);
    }

    public static void checkResult(String modifiedText, String targetText) {
        if (modifiedText.equals(targetText)) {
            System.out.println("  !!!!!   Преобразование выполнено успешно!!!");
        } else {
            System.out.println("Нужно поработать еще!!!");
        }
    }

    public static String textModifier(String text) {

        char[] inputtedText = text.toCharArray();
        System.out.print("Исходный текст                      - ");
        for (char c : inputtedText) {// ToDo delete?
            System.out.print(c + ", ");
        }
        System.out.println();// Todo delete?

        ArrayList<Character> textWithoutSpaces = Spaces.deleteSpaces(inputtedText);
        System.out.println("Текст без пробелов                  - " + textWithoutSpaces);

        ArrayList<Character> textChangedChars = Dash.changePlaces(textWithoutSpaces);
        System.out.println("Текст с поменявшими места символами - " + textChangedChars);

        ArrayList<Character> textWithoutPluses = Plus.deletePluses(textChangedChars);
        System.out.println("Текст без плюсов                    - " + textWithoutPluses);

        ArrayList<Character> textWithProcessedDigits = Digits.digitsProcessing(textWithoutPluses);
        System.out.println("Текст с обработанными символами     - " + textWithProcessedDigits);

        StringBuilder builtText = new StringBuilder();
        for (Character ch : textWithProcessedDigits) {
            builtText.append(ch);
        }
        return builtText.toString();
    }
}
