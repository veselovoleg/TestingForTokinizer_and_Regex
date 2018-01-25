package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test05 {
    public static void main(String[] args) {
        //использование спецсимвола ^ - отрицание

        //Ищем комбинацию, в которой за буквой "q" стоит любой символ, кроме "u"
        Pattern p1 = Pattern.compile("q[^u]");
        Matcher m1 = p1.matcher("Iraq is a country");

        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }
        System.out.println(" ");
        //При поиске символов не стоит забывать про их экранирование и постановку в паттерне
        Pattern p2 = Pattern.compile("[\\Q[-]\\E]"); //Ищем символы "[", "-", "]"
        Matcher m2 = p2.matcher("Do do do it now [Plus + & Minus -]");

        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }
    }
}