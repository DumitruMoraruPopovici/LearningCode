package Codebat;

//answerCell(false, false, false) → true
//answerCell(false, false, true) → false
//answerCell(true, false, false) → false
public class answerCell {
    public static void main(String[] args) {
        System.out.println(" The new value is: " + new answerCell().answerCell(true, true, false));
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (!isAsleep) {
            if (isMorning) {
                if (isMom) {
                    return true;
                }
                return false;
            }


        }
        return true;
    }
}
//Your cell phone rings. Return true if you should answer it.
// Normally you answer, except in the morning you only answer
// if it is your mom calling. In all cases, if you are asleep, you do not answer.