package Codebat;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("MOUSE");
        sb.insert(0, ' ');
        sb.replace(2,4,"No");
        sb.insert(5, "CAT");
        sb.delete(5,1);
        sb.reverse();
        System.out.println(sb.length());
    }
}
// exception is thrown