package ec.OOP.abstractE.form.elementos.validator;

public class RequestedValidator extends Validator {
    protected String message = "%s: The field is required";
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
        return (value != null && (!value.isEmpty()));
    }
}
