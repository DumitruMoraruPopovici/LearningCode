package Codebat;

public class parrotTrouble {
    public static void main(String[] args) {
        int hour = 10;
        boolean talking = true;
        if (hour < 7 || hour > 20){
            System.out.println(talking);
        }
        else {
            System.out.println(!talking);
        }
    }
}


// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
// We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.