package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {

    public static void main(String[] args) {
           /* java.util.regex позволяет работать с регулярными выражениями. Например, создавать паттерны (пример: установить
        символы, которые пользователь может использовать с своем логине для сайта, и какие не может)      */

        //Разберемся с тем, как работают регулярные выражения.

        /* Создаем паттерн для верификации E-mail адреса
        * */
        Pattern checkEmail = Pattern.compile("\\b[A-Za-z0-9._%+1]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        // Теперь проверим, соответсвует ли наш ящик паттерну, для этого сравнения используется Matcher
        Matcher checkEmailWithPattern = checkEmail.matcher("My Email is ananas@info.ru");

        while (checkEmailWithPattern.find()) { //ищем, пока не найдем соответсвие паттерну
        // .start() - номер найденной позиции в строке с первой буквы, .group() - что нашли
        System.out.println(checkEmailWithPattern.start() + " " + checkEmailWithPattern.group() + " ");
        // Ответ будет: 12 ananas@info.ru , где 12 - номер позиции в строке (с нуля), и найденный емейл
        }

    }
}
