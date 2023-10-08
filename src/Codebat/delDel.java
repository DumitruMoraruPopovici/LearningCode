package Codebat;
// delDel("adelbc") → "abc"
//delDel("adelHello") → "aHello"
//delDel("adedbc") → "adedbc"
public class delDel {

    public static void main(String[] args) {
    delDel word = new delDel();
        System.out.println(word.delDel("adelHello"));
    }

    public String delDel(String str) {
        if(str.length() > 3){
            if(str.substring(1,4).equals("del")) {
                return str.charAt(0) + str.substring(4, str.length());
            }
            else return str;

        }
        return str;
    }
}

//Given a string, if the string "del" appears starting at index 1,
// return a string where that "del" has been deleted. Otherwise, return the string unchanged.
