package EpamExam;

public class Strings {
    public static void main(String[] args) {
        String str = "12.x.3a.4";
        String[] strings =str.split("\\d");
        for (String s: strings) {
            System.out.print(s + " ");
        }
        System.out.print(" ");
        strings = str.split("\\.");
        for(String s:strings) {
            System.out.print(s + " ");
        }
    }
}
// result .x. a.  12 x 3a 4
