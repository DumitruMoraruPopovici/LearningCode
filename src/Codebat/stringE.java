package Codebat;
//stringE("Hello") → true
//stringE("Heelle") → true
//stringE("Heelele") → false
public class stringE {

    public static void main(String[] args) {
    stringE word = new stringE();
        System.out.println(word.stringE("Heleleeo"));
    }

    public boolean stringE(String str) {
        int counter = 0;
        boolean isCounter = true;
    for(int i = 0; i < str.length(); i++ ){
        if (str.charAt(i) == 'e'){
            counter = counter + 1;
        }
    }
    if(counter >= 1 && counter <= 3 ){
        return isCounter;
    }
    return !isCounter;
    }
}

//  int count = 0;
//
//  for (int i=0; i<str.length(); i++) {
//    if (str.charAt(i) == 'e') count++;
//    // alternately: str.substring(i, i+1).equals("e")
//  }
//
//  return (count >= 1 && count <= 3);


//Return true if the given string contains between 1 and 3 'e' chars.