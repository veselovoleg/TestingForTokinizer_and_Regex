package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test09 {
    public static void main(String[] args) {
        //Границы слова

        Pattern p1 = Pattern.compile("\\bis\\b");
        //Мы выделили гоаницы слова при помощи символа \\b (начало и конец слова).
        // Теперь мы сможем найти "is' только как самостоятельное слово
        Matcher m1 = p1.matcher("This island is a very beautiful!");
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }
        System.out.println(" ");
        //Начало и конец строки, Anchors

       // Pattern p2 = Pattern.compile("^a"); //находим строку, что начинается на "а" (^ без [] - начало строки)
       Pattern p2 = Pattern.compile("c$"); // находим строку, что заканчивается на "c"
        Matcher m2 = p2.matcher("abc");
        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }

        System.out.println(" ");

    }
}
