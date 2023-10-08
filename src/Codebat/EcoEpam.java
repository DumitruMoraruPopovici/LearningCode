package Codebat;

public abstract class EcoEpam {
    public abstract void checkValue(Object val) throws IllegalArgumentException;
    public boolean isValueANumber(Object v) {
        if (v instanceof Number) {
            return true;
        }
        else {
            try{
                Double.parseDouble(v.toString());
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
}
