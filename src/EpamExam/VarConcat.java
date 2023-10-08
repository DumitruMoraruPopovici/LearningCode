package EpamExam;

public class VarConcat {
    public static void main(String[] args) {
        var var1 = "A";
        var var2 = "B";
        var var3 = "C";
        var1.concat(var2).concat(var3);
        System.out.println(var3.concat(var1).concat(var2));

    }

}
// result is CAB