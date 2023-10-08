package Codebat;

public class diff21 {

    public static void main(String[] args) {
        int n = 10;
        int diff21 = 0;

        if(n<=21){
            diff21 = 21 - n;
        }
        else {
            diff21 = (n-21) * 2;
        }
        System.out.println(diff21);

    }
}


 //   Given an int n, return the absolute difference between n and 21,
//   except return double the absolute difference if n is over 21.