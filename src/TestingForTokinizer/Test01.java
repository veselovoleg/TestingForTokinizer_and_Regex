package TestingForTokinizer;

import java.util.StringTokenizer;
import static java.lang.System.*;

public class Test01 {

    //в данном проекте проводится исследование умений и свойств класса Tokinizer, использование регулярных выражений

    public static void main(String[] args) {
        //создадим строку с пробелами
        String stringWithSpaces = "I hope you will be better";

        //создаем Tokinizer, берущий значение нашей строки с пробелами
        StringTokenizer stringWithSpacesTokenizer = new StringTokenizer(stringWithSpaces);
        out.println("Используем StringTokenizer:");
        //данный цикл разделяет слова, находя пробелы между ними
        while (stringWithSpacesTokenizer.hasMoreTokens()) {
            out.println(stringWithSpacesTokenizer.nextToken());
        }
        // Результат - разибение строки на stringWithSpaces отдельные слова

        // StringTokenizer считается устаревшим, и его не рекомендуется использовать
        //вместо этого, документация предлагает использовать метод String.split, относящийся к пакету java.util.regex

    }
}
