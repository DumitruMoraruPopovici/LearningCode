package Codebat;

public class front3 {

    public static void main(String[] args) {
    front3 word = new front3();
        System.out.println(word.front3("Java"));

    }

    public String front3(String str) {
    String front;
    if(str.length()>=3){
        front = str.substring(0,3);
    }
    else {
        front = str;
    }
    return front + front + front;
    }
}
