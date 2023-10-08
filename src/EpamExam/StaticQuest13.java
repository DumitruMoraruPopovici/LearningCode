package EpamExam;

public class StaticQuest13 {
    static StaticQuest13 s = null;
    {
        System.out.print("A");
    }
    static {
        s.m();
    }
    static void m() {
        System.out.print("M");
    }

    public static void main(String[] args) {
        s.m();
    }
}
