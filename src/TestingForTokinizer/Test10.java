package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {
    // Паттерн для поиска набора цифр
    public static void main(String[] args) {
        Pattern checkNumber = Pattern.compile("^\\d+$"); //Начало и конец строки, а в ней только цифры
        Matcher checkNumberMutcher = checkNumber.matcher("54546");
        while (checkNumberMutcher.find()) { //Если такую на одим, то пишем,что это число. Если нет, надпись не выводится
            System.out.println("It is a number");
        }
        System.out.println(" ");
        // Ищем в нескольких строках
        Pattern checkIt = Pattern.compile("ne$", Pattern.MULTILINE); //Ищем строку, заканчивающуюся на ne, в нескольких строках
        // Еще естьвариант такого написания начала/конца строки (\\Ane\\Z)
        Matcher checkItMutcher = checkIt.matcher("Fist line\nSecond line");// \n - новая строка
        while (checkItMutcher.find()) {
            System.out.println(checkItMutcher.start() + " " + checkItMutcher.group() + " ");
        }
    }

}
