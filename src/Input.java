import java.util.ArrayList;

public class Input {
    public static void main(String[] args) {
        String targetText1 = "генрих играет! илюбитшколу 3";
        String targetText2 = "Я люблю джаву всем сердцем!";

        String input = "Ввее-дно   три пр+обела";// ToDo Переделать на ввод из консоли  и добавить отображение введенного текста
        String modifiedText = textModifier(input);
        System.out.println("Текст после всех изменений:");
        System.out.println("     " + modifiedText);

        input = "Введено   дв -араза     по     пять   пробелов.";
        modifiedText = textModifier(input);
        System.out.println("Текст после всех изменений:");
        System.out.println("     " + modifiedText);

        input = "генрих1  играет+2   л-июбит0школу";
        modifiedText = textModifier(input);
        System.out.println("Текст после всех изменений:");
        System.out.println("     " + modifiedText);

    }// main

    public static String textModifier(String text) {

        char[] inputtedText = text.toCharArray();
        System.out.println();

        for (char c : inputtedText) {// ToDo delete
            System.out.print(c + ", ");
        }
        System.out.println();// Todo delete

        ArrayList<Character> textWithoutSpaces = Spaces.deleteSpaces(inputtedText);
        System.out.println("Текст без пробелов - " + textWithoutSpaces);

        ArrayList<Character> textChangedChars = Dash.changePlaces(textWithoutSpaces);
        System.out.println("Текст с поменявшими места символами - " + textChangedChars);

        ArrayList<Character> textWithoutPluses = Plus.deletePluses(textChangedChars);
        System.out.println("Текст без плюсов - " + textWithoutPluses);

        // ToDo StringBuilder. Заменить на массив, полученный после последнего преобразования.
        StringBuilder builtText = new StringBuilder();
        for (Character ch : textWithoutPluses) {
            builtText.append(ch);
        }

        return builtText.toString();

    }


}// class
