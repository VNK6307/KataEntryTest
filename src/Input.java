public class Input {
    public static void main(String[] args) {
        String input = "Введено   три пробела";

        char[] inputtedText = input.toCharArray();
        System.out.println(inputtedText.length);
        for (char c : inputtedText) {
            System.out.print(c + ", ");
        }
        System.out.println();

        Spaces.deleteSpaces(inputtedText);

        input = "Введено   два раза     по     пять   пробелов. ";
        inputtedText = input.toCharArray();
        for (char c : inputtedText) {
            System.out.print(c + ", ");
        }
        System.out.println();
        Spaces.deleteSpaces(inputtedText);

    }
}
