package Codebat;
//helloName("Bob") → "Hello Bob!"
//helloName("Alice") → "Hello Alice!"
//helloName("X") → "Hello X!"
public class helloName {

    public static void main(String[] args) {
    helloName word = new helloName();
        System.out.println(word.helloName("Bob"));
    }

    public String helloName(String name) {
        String welcome = "Hello ";
        String last = "!";
        return welcome + name + last;

    }
}


//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".