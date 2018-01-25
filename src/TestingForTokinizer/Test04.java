package TestingForTokinizer;
import static java.lang.System.out;
import java.util.StringTokenizer; //импорт Tokinizer'а
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test04 {

    public static void main(String[] args) {

        /*В регулярных выражениях есть понятие метасимволов - те символы, имеющие специальное значение.
        Эти символы: ()+\.^?*$
        Если мы впишем выражение 1+1=2, то знак "+" будет воспринят программой, как метасимвол
        Если к выражению приписать Q и E, то программа вопримет его, как строку, и мы найдем то, что ищем
        Так же можно поставит перед + двойной слэш \\  (1\\+1=2), он так же экранирует
        Еще символ можно вписать в квадртаные скобки. Например, [*] - тоже экранирует
        */
       Pattern checkStringWithPlus = Pattern.compile("\\Q1+1=2\\E");
        Matcher checkStringWithPlusWithPattern = checkStringWithPlus.matcher("1+1=2");
        while (checkStringWithPlusWithPattern.find()) {
            System.out.print(checkStringWithPlusWithPattern.start() + " " + checkStringWithPlusWithPattern.group() + " ");
        }
        System.out.println(" ");

        String stringWithSpaces = "I hope you will be better";
        String [] resultWithSplit = stringWithSpaces.split("\\s");
        //         Пример ниже  использует метасимвол "\\s", обозначающий пробел
        out.println("Используем Split:");
        for (int i=0; i < resultWithSplit.length; i++) {
            out.println(resultWithSplit [i]);
        }
        // Результат - разбиение строки на stringWithSpaces отдельные слова, но при этом каждое слово сохраняется в элементе массива*/





    }
}
