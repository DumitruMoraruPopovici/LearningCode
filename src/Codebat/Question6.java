package Codebat;

import java.io.*;

class Some implements Serializable{
    String s = "S";
    int a = 1;
    Inner in;
    class Inner extends Some {}

}
public class Question6 {
    public static void main(String[] args) {
        Some some = new Some();
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("next.se"));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("next.se"))) {
            out.writeObject(some);
            System.out.println(out.toString());
            Some someRestored = (Some) in.readObject();
            System.out.println(someRestored.in.s);
            System.out.println(someRestored.in.a);
        }catch (IOException|ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
// an exception is thrown at runtime