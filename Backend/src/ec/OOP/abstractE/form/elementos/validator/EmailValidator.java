package ec.OOP.abstractE.form.elementos.validator;

public class EmailValidator extends Validator{

    protected String message = "%s: Invalid  format";

    private  final static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean isValid(String value) {
        return value.matches(EMAIL_REGEX);
    }


}
