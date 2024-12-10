package ec.OOP.abstractE.form.elementos.validator;

import ec.OOP.abstractE.form.elementos.validator.message.IMessageFormated;

public class LengthValidator  extends Validator implements IMessageFormated {

    protected String message = "%S: The length must be between %d and %d";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LengthValidator() {
    }

    public LengthValidator(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

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

        if (value == null || value.isEmpty()) {
            return true;
        }
        int length = value.length();

        return (length >= this.min) && (length <= this.max);
    }

    @Override
    public String getMessageFormated(String camp) {
        return String.format(this.message,camp,this.min, this.max);
    }
}
