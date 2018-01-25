package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test08 {
    public static void main(String[] args) {

        //Создадим паттерн для нахождения слова, что находятся в кавычках
        Pattern dotWork = Pattern.compile("\".*\""); //Не забываем экранивровать кавычки., . - любой символ, * - означвает, что символов будет много
        Matcher dotWorkRunner = dotWork.matcher("Put a \"string\" before the double quotes"); //Опять же, экранируем кавычки

        while (dotWorkRunner.find()) {
            System.out.println(dotWorkRunner.start() + " " + dotWorkRunner.group() + " ");
        }

        System.out.println(" ");
        //Однако, тут есть проблема: при проверке такого слчетания: "I have a problem with \"string 1\" and \"string 2\"."
        //Итогом будет захват все области. Результат: 22 "string 1" and "string 2"  , те все, что  между кавычками тоже сосчитается
        Pattern dotWork2 = Pattern.compile("\".*?\"");
        //Greedy (жадный) оператор можно изменить, если добавить знак "?" (X? - X, once or not at all)
        Matcher dotWorkRunner2 = dotWork2.matcher("I have a problem with \"string 1\" and \"string 2\".");
        //Теперь он найдет слова порознь, не прихватитв лишнего
        while (dotWorkRunner2.find()) {
            System.out.println(dotWorkRunner2.start() + " " + dotWorkRunner2.group() + " ");
        }
        System.out.println(" ");
        //И еще один вариант
        Pattern dotWork3 = Pattern.compile("\"[^\"\r\n]*\""); //не могут быть символы конца строки, либо другой кавычки
        Matcher dotWorkRunner3 = dotWork3.matcher("I have a problem with \"string 1\" and \"string 2\".");

        while (dotWorkRunner3.find()) {
            System.out.println(dotWorkRunner3.start() + " " + dotWorkRunner3.group() + " ");
        }
    }
}
