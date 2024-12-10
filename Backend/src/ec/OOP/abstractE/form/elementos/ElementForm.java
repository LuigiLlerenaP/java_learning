package ec.OOP.abstractE.form.elementos;

import ec.OOP.abstractE.form.elementos.select.Option;
import ec.OOP.abstractE.form.elementos.validator.LengthValidator;
import ec.OOP.abstractE.form.elementos.validator.Validator;
import ec.OOP.abstractE.form.elementos.validator.message.IMessageFormated;

import java.util.ArrayList;
import java.util.List;

abstract  public class ElementForm {

    protected String valueHtml;
    protected String nameHtml;
    protected String id;

    private final List<Validator> validatorList;
    private final List<String> errors;

    public ElementForm() {
        this.validatorList = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ElementForm(String nameHtml) {
        this();
        this.nameHtml = nameHtml;
    }
    public ElementForm(String id, String nameHtml) {
        this(nameHtml);
        this.id = id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public ElementForm addValidator(Validator validator) {
        this.validatorList.add(validator);
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }
    public void setValueHtml(String valueHtml) {
        this.valueHtml = valueHtml;
    }

    public  boolean isValid() {
        for (Validator validator : validatorList) {
            if (!validator.isValid(this.valueHtml)) {
                if (validator instanceof IMessageFormated){
                    this.errors.add(((IMessageFormated) validator).getMessageFormated(this.nameHtml));
                }
                this.errors.add(String.format(validator.getMessage(),this.nameHtml));
            }
        }
        return this.errors.isEmpty();
    }



    abstract  public  String drawHtml();

}
