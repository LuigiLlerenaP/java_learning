package ec.OOP.abstractE.form.elementos;

public class InputForm extends ElementForm{

    private  String type = "text";

    public InputForm(String nameHtml) {
        super(nameHtml);
    }

    public InputForm(String nameHtml, String type) {
        super(nameHtml);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String drawHtml() {
        return "<input type=\""+this.type+"\" id=\""+this.id+"\" name=\""+this.nameHtml+"\" value=\""+this.valueHtml+"\">";
    }

}
