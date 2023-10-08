package EpamExam;

public class D5 {
    public static void main(String[] args) {
        int k=0;
        try {
            int i = 5/k;
        } catch (ArithmeticException e) {
            System.out.println("A");
            return;
        }
        catch (RuntimeException e) {
            System.out.println("B");
            return;
        }
        catch (Exception e) {
            System.out.println("C");
            return;
        }
        finally {
            System.out.println("D");
        }
        System.out.println("E");
    }
}
//AD answer