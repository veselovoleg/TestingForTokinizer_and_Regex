package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test11 {
    public static void main(String[] args) {
        //Использование символа | pipeline

        //Мы ищем одно из этих слов
        //Проблема в том, что найдется только слово "Set", так как жтот кусочек встречается первым
        Pattern p2 = Pattern.compile("Get|Getvalue|Set|Setvalue");
        Matcher m2 = p2.matcher("Setvalue");
        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }

        System.out.println(" ");
        // При помощи данного выражения, мы уже будем искать полное соответвие слову
        Pattern p1 = Pattern.compile("Get(value)|Set(value)");
        //Еще есть такие варианты:
        //"(Get|Set)(value)?"
        //"\\bGet|Getvalue|Set|Setvalue\\b"
        Matcher m1 = p1.matcher("Setvalue");
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }

    }
}
