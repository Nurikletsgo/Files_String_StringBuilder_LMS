import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    
                    1. Созду тескерисинен кылып кайтарган метод
                    2. Создордун массивдерин бир сапка бириктирген метод
                    3. Создо канча ундуу тамга бар экенин эсептеген метод
                    4. Создун палиндром экенин текшеруучу метод
                    5. Сөздүн биринчи тамгасын баш тамга менен жазуучу метод
                    6. Сүйлөмдөгү сөздөрдүн санын эсептөөчу метод
                    7. Aр бир тамганын өзүнүн ASCII коду менен алмаштырган метод
                    8. Cуйломдон бардык боштуктарды (пробелдерди) алып салуучу метод
                    9. Программаны токтотуу
                               TEST
                    """);
            try {
                switch (new Scanner(System.in).nextInt()) {
                    case 1:
                        System.out.println("Соз жазыныз ");
                        System.out.println(getInReverse(scanner.nextLine()));
                        break;
                    case 2:
                        System.out.println("3 массивге   экиден соз жазыныз");
                        System.out.println(getArrayStringBuilder(new String[]{scanner.nextLine(), scanner.nextLine()}, new String[]{scanner.nextLine(), scanner.nextLine()}, new String[]{scanner.nextLine(), scanner.nextLine()}));
                        break;
                    case 3:
                        System.out.println("Ундуу тамга камтылган соз жазыныз ");
                        System.out.println(getAllConsonants(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.println("Соз жазыныз (полиндром)");
                        System.out.println(getPalindromeCheck(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.println("кичине тамга менен соз жазыныз");
                        System.out.println(getWordFirstLetterToUpperCase(scanner.nextLine()));
                        break;
                    case 6:
                        System.out.println("Текст жазыныз (бир линияга) ");
                        System.out.println(getWordsLength(scanner.nextLine()));

                        break;
                    case 7:
                        System.out.println("Соз жазыныз (ASCII)");
                        System.out.println(getASCIICode(scanner.nextLine()));
                        break;
                    case 8:
                        System.out.println("Текст  жазыныз (бир линияга)");
                        System.out.println(getSentenceWithoutSpaces(scanner.nextLine()));
                        break;
                    case 9:
                        return;
                    default:
                        System.err.println(" write again");
                }
            } catch (InputMismatchException e) {
                System.err.println("Caн жаз !");
            }
        }
    }

    /**
     * 1. Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз.
     */
    public static StringBuilder getInReverse(String word) {
        return new StringBuilder(word).reverse();
    }

    /**
     * 2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.
     */
    public static String getArrayStringBuilder(String[]... words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String[] word : words) {
            for (String string : word) {
                stringBuilder.append(string).append(" ");
            }
        }
        return stringBuilder + "   ";
    }

    /**
     * 3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.
     */
    public static String getAllConsonants(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if ("AUEIOаеиэуоыяюauioeАЮЯУЫЕИОЭ".indexOf(currentChar) != -1) {
                count++;
            }
        }
        return "Бул создо " + count + " ундуу тамга бар";
    }

    /**
     * 4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз.
     */
    public static String getPalindromeCheck(String word) {
        StringBuilder reversedWord = new StringBuilder(word).reverse();
        if (word.contentEquals(reversedWord)) {
            return "Бул соз палиндромом";
        } else {
            return "Бул соз палиндром эмес";
        }
    }

    /**
     * 5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу  метод туз.
     */
    public static String getWordFirstLetterToUpperCase(String word) {
        StringBuilder wordFirstLetterWithUpperCase = new StringBuilder(word);

        return wordFirstLetterWithUpperCase.substring(0, 1).toUpperCase() + wordFirstLetterWithUpperCase.substring(1);
    }

    /**
     * 6. String жана StringBuilder жа кпрдамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.
     */
    public static String getWordsLength(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);

        String words = stringBuilder.toString();
        String[] word = words.split("\\s+");

        int wordCount = word.length;

        return "Бул тексттеги создордун саны : " + wordCount;
    }

    /**
     * 7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.
     */
    public static String getASCIICode(String word) {
        StringBuilder ACSIICode = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            int ACSIICodes = (int) character;
            ACSIICode.append(ACSIICodes).append(" ");
        }
        return "Бул создун ASCII коду : " + ACSIICode.toString().trim();
    }


    /**
     * 8. StringBuilder аркылуу cуйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз.
     */
    public static String getSentenceWithoutSpaces(String string) {
        StringBuilder sentence = new StringBuilder(string);

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                sentence.delete(i, i + 1);
            }
        }
        return sentence + "";
    }
}