package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test07 {
    public static void main(String[] args) {
        // Использование точки в регулярных выражениях
        // . может заменить собой любой символ, кроме конца строки - [^\r\n] в windows (\r\n - конец строки)

        //Паттерн, применяющий дату /dd/mm/yy/

        Pattern date = Pattern.compile("\\d\\d.\\d\\d.\\d\\d"); //цифра цифра(любой символ) цифра цифра(любой символ) цифра цифра
        Matcher dateRunner = date.matcher("26/04/92");

        while (dateRunner.find()) {
            System.out.println(dateRunner.start() + " " + dateRunner.group() + " ");
        }
        System.out.println(" ");

        // Однако,  с данным паттерном есть пробелма: если я напишу что то типа "0151166846" без раздедителей, он все найдет и в таком виде выведет

        // Усовершенствованный паттерн с датой
        Pattern date2 = Pattern.compile("\\d\\d[.-/]\\d\\d[.-/]\\d\\d"); //цифра цифра(любой символ) цифра цифра(любой символ) цифра цифра
        Matcher dateRunner2 = date2.matcher("260492");
        //данный паттерн не найдет соотвествий
        while (dateRunner2.find()) {
            System.out.println(dateRunner2.start() + " " + dateRunner2.group() + " ");
        }
    }
}