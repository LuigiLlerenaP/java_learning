package ec.OOP.abstractE.form.elementos;

import ec.OOP.abstractE.form.elementos.select.Option;

import java.util.ArrayList;
import java.util.List;

public class SelectForm  extends  ElementForm{
    private final List<Option>  options;

    public SelectForm(String nameHtml) {
        super(nameHtml);
        this.options = new ArrayList<>();
    }

    public SelectForm(String nameHtml, List<Option> options) {
        super(nameHtml);
        this.options = options;
    }
    public  SelectForm  addOption(Option option){
        this.options.add(option);
        return this;
    }

    @Override
    public String drawHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name=\"")
                .append(this.nameHtml)
                .append("\" id=\"")
                .append(this.id)
                .append("\">");

        for (Option option : this.options) {
            sb.append("\n<option value='").append(option.getValueOption()).append("'");

            if (option.isSelected()) {
                sb.append(" selected");
                this.valueHtml = option.getValueOption();
            }

            sb.append(">").append(option.getNameOption()).append("</option>");
        }

        sb.append("\n</select>");
        return sb.toString();
    }

}
