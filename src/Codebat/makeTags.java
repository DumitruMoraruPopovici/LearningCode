package Codebat;
import java.lang.Math;
//makeTags("i", "Yay") → "<i>Yay</i>"
//makeTags("i", "Hello") → "<i>Hello</i>"
//makeTags("cite", "Yay") → "<cite>Yay</cite>"
public class makeTags {

    public static void main(String[] args) {
    makeTags htmlWord = new makeTags();
        System.out.println(htmlWord.makeTags("i","Yay"));
    }

    public String makeTags(String tag, String word) {
    String first = "<" + tag + ">";
    String last = "</" + tag + ">";
    return first + word + last;

    }
}

//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
// In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
// Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".