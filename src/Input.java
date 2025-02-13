import java.util.ArrayList;

public class Input {
    public static void main(String[] args) {
        String targetText1 = "генрих играет! илюбитшколу 3";
        String targetText2 = "Я люблю джаву всем сердцем!";

        String input = "Ввее-дно   три пр+обела";// ToDo
        textModifier(input);

        input = "-Введено   дв -араза     по     пять   пробелов. ";
        textModifier(input);

        input = "генрих1  играет+2   л-июбит0школу";
        textModifier(input);

    }// main

    //    public static String textModifier() {// ToDo Переделать в String
    public static void textModifier(String text) {

        char[] inputtedText = text.toCharArray();
        System.out.println();
        System.out.println("Number of symbols in text: " + inputtedText.length);// ToDo delete

        for (char c : inputtedText) {
            System.out.print(c + ", ");
        }
        System.out.println();// ToDo delete

        ArrayList<Character> textWithoutSpaces = Spaces.deleteSpaces(inputtedText);
        System.out.println("Текст без пробелов - " + textWithoutSpaces);
        System.out.println();// ToDo delete

        ArrayList<Character> textChangedChars = Dash.changingPlaces(textWithoutSpaces);
        System.out.println("Текст с поменявшими места символами - " + textChangedChars);
        System.out.println();// ToDo delete

        ArrayList<Character> textWithoutPluses = Plus.deletePluses(textChangedChars);
        System.out.println("Текст без плюсов - " + textWithoutPluses);
        System.out.println();// ToDo delete


    }


}// class
