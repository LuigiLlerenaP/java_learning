package ec.OOP.abstractE.form.elementos.select;

public class Option {
    private String nameOption;
    private String valueOption;
    private  boolean selected;

    public Option() {
    }

    public Option(String nameOption, boolean selected, String valueOption) {
        this.nameOption = nameOption;
        this.selected = selected;
        this.valueOption = valueOption;
    }

    public String getNameOption() {
        return nameOption;
    }

    public void setNameOption(String nameOption) {
        this.nameOption = nameOption;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public Option setSelected() {
        this.selected = true;
        return this;
    }

    public String getValueOption() {
        return valueOption;
    }

    public void setValueOption(String valueOption) {
        this.valueOption = valueOption;
    }
}
