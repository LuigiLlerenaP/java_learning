package ec.OOP.abstractE.form.elementos.validator;

public class NumValidator extends  Validator {
    protected String message ="%s: The field is required in a number";
    @Override
    public String getMessage() {
        return "";
    }

    @Override
    public void setMessage(String message) {

    }

    @Override
    public boolean isValid(String value) {
        try {
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
}
