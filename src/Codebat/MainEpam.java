package Codebat;
interface Person {
    String getName();
}
class Human implements Person {
    public String name;
    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
class Student extends Human {
    public Student (String name) {
        super(name);
    }
}
public class MainEpam {
    public static void main(String[] args) {
        Person p = new Student("Mike");
        System.out.println(p.getName());
    }
}
// varianta a 3-a, a 4 a, a 5 a,