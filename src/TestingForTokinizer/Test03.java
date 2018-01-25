package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03 {

    public static void main(String[] args) {
        //Здесь мы просто найдем все строчные буквы а, выведем их положение в строке
        //Таким же образом, мы можем искать и слова
        Pattern CheckStringForCharA = Pattern.compile("a");
        Matcher CheckStringForCharAWithPattern = CheckStringForCharA.matcher("Hello, my name is Alex Wans. How are you doing?");
        while (CheckStringForCharAWithPattern.find()) {
            System.out.print(CheckStringForCharAWithPattern.start() + " " + CheckStringForCharAWithPattern.group() + " ");
        }

        System.out.println("");
        //При помощи данного паттерна, мы можем найти группы символов, что вписаны в квадратные скобки
        Pattern checkItForDifferentSymbols = Pattern.compile("[0-5a-zA-C*]");
        Matcher matchCheckItForDifferentSymbols = checkItForDifferentSymbols.matcher("187a*cAZm");

        while(matchCheckItForDifferentSymbols.find()) {
        System.out.print(matchCheckItForDifferentSymbols.start() + " " + matchCheckItForDifferentSymbols.group() + " ");
            System.out.print(" ");
        }
        System.out.println("");

        //Можно сделать так, чтобы паттерн находил слово, даже если в нем изменят букву

        Pattern checkGray= Pattern.compile("gr[ae]y");
        Matcher matchGray = checkGray.matcher("grey");

        while(matchGray.find()) {
            System.out.print(matchGray.start() + " " + matchGray.group() + " ");
            System.out.print(" ");
        }

    }
}
