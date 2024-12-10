package ec.OOP.abstractE.form.elementos.validator;

public class NoNullValidator extends Validator{
    protected String message = "%s: The field cannot be null.";
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean isValid(String value) {
        return (value != null);
    }
}
