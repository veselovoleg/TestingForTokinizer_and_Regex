package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test06 {
    public static void main(String[] args) {

       /* Class Pattern - Predefined character classes
        .	Any character (may or may not match line terminators)
        \d	Все цифры: [0-9]
        \D	Не цифры: [^0-9]
        \s	Пробелы и табуляция: [ \t\n\x0B\f\r]
        \S	Все, кроме пробелов и табуляций: [^\s]
        \w	Набор букв и цифр : [a-zA-Z_0-9]
        \W	Все, кроме букв и цифр: [^\w]
       */
        //Находим все цифры в нашей строке
        Pattern p1 = Pattern.compile("\\d");
        Matcher m1 = p1.matcher("abs + cfg01 = 15");
        //В паттерне можно написать так: Pattern.compile("[\\s\\d"]) - будет искать либо пробелы, либо все цифры
        //Однако, если написать: Pattern.compile("\\s\\d") - без [], будет искать пробел, после которого идет цифра (не или/или)
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }
    }
}
