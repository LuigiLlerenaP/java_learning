package ec.OOP.abstractE.form.elementos.validator;

abstract  public class Validator {

    protected  String message;

    abstract  public String getMessage();
    abstract  public void setMessage(String message) ;

    abstract public boolean isValid(String value);

}
