import java.util.ArrayList;

public class Input {
    public static void main(String[] args) {
        String input = "Введено   три пробела";
        textModifier(input);

        input = "Введено   два раза     по     пять   пробелов. ";
        textModifier(input);

        input = "генрих1  играет+2   л-июбит0школу";
        textModifier(input);

    }// main

    //    public static String textModifier() {// ToDo Переделать в String
    public static void textModifier(String text) {

        char[] inputtedText = text.toCharArray();
        System.out.println("Number of symbols in text: " + inputtedText.length);// ToDo delete
        for (char c : inputtedText) {
            System.out.print(c + ", ");
        }
        System.out.println();// ToDo delete

        ArrayList textWithoutSpaces = Spaces.deleteSpaces(inputtedText);
        System.out.println(textWithoutSpaces);



    }


}// class
