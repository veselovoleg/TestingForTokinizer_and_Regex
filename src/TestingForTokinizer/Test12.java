package TestingForTokinizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test12 {
    public static void main(String[] args) {

        //Optional Items
        //В Британском английском пишется Color, в Американском Colour, те в слове может не быть буквы "u"

        //Для того, чтобы опеределить, что буква будет или может не быть, после нее ставяится знак "?"
        Pattern p1 = Pattern.compile("Colou?r");
        Matcher m1 = p1.matcher("Color Colour");

        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group() + " ");
        }
        System.out.println(" ");
        //Использваоние Optional Items для поиска месяца
        Pattern p2 = Pattern.compile("Nov(ember)?"); //Будет выводить все слово November, так как greedy. Исправим на "Nov(ember)??"
        Matcher m2 = p2.matcher("November Nov"); //"Nov" - сокращение в календаре

        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }
        System.out.println(" ");

        //И еще один пример использования
        Pattern p3 = Pattern.compile("Feb(ruary)? 23(rd)?"); //
        Matcher m3 = p3.matcher("February 23, February 23rd, Feb 23, Feb 23rd"); //

        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group() + " ");
        }
    }
}
