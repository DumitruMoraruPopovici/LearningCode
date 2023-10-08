package EpamExam;

public class T7 {
    interface Able{}
    interface Action extends Able {}
    interface Service extends Action {}
    static class Generic<T> {}
    static void exec(Generic <? super Action> gen) {}

    public static void main(String[] args) {
//        exec(new Generic<Able>());
//        exec(new Generic<Action>());
//        exec(new Generic<Service>());
//        exec(new Generic());
    }
}
// compile error at line 13
