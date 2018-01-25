package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test13 {
    public static void main(String[] args) {

        //Использование символов * и +

        //Поиск тега в HTML
        Pattern p1 = Pattern.compile("<[a-zA-Z][a-zA-Z0-9]*"); //[a-zA-Z0-9]* - здесь иожет быль или не быть любое количество цифр и букв
        //[a-zA-Z0-9]+ - этот набор символов должен встречаться минимум 1 раз. Таким образом, не будет найден тег <a>
        Matcher m1 = p1.matcher("<H1>");

        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }
        System.out.println(" ");
        //Использjвание {}
        Pattern p2 = Pattern.compile("\\b[1-9][0-9]{2,4}\\b"); //Ищем число, что начинается с  1до9, и после первой цифры, есть еще 2-4
        Matcher m2 = p2.matcher("100 99999");

        //По сути "*" - это {0,}, "+" - это {1,} (от нуля до бесконечности, от единмцы до бесконечности)

        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }
        System.out.println(" ");

        Pattern p3 = Pattern.compile("\\b[1-9][0-9]{3}\\b"); //Ищем число, что начинается с  1до9, и после первой цифры, есть еще ровно 3
        Matcher m3 = p3.matcher("100 99999 9562");
        //Находит только "9562", так как {3} - ровно 3 цифры после первой

        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group() + " ");
        }

        //
        Pattern p4 = Pattern.compile("<.+?>"); //Ищем тег, заключенный меж < и >. Если не ставить "?", то greedy выведет "<EM>first</EM>"
        Matcher m4 = p4.matcher("This is <EM>first</EM> test");
        //С добавление знака "?", greedy становится reluctant (он же lazy), вытаскивает только то, что нам нужно
        // Еще вариант: "<[^>]+>" - между скобок может быть любой знак, кроме ">", на нем поиск кончается
        while (m4.find()) {
            System.out.println(m4.start() + " " + m4.group() + " ");
        }

    }
}
