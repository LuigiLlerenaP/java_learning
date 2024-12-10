package ec.OOP.abstractE.form.elementos;

public class LabelForm extends ElementForm {

    private String forLabel;
    private String title;
    private String style;


    public LabelForm(String nameHtml) {
        super(nameHtml);
        this.forLabel = "";
        this.title = "";
        this.style = "";
    }


    public LabelForm( String nameHtml , String forLabel, String title, String style) {
        super(nameHtml);
        this.forLabel = forLabel != null ? forLabel : "";
        this.title = title != null ? title : "";
        this.style = style != null ? style : "";
    }

    public String getForLabel() {
        return forLabel;
    }

    public void setForLabel(String forLabel) {
        this.forLabel = forLabel;
    }


    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String drawHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<label");

        if (!this.forLabel.isEmpty()) {
            sb.append(" for=\"").append(this.forLabel).append("\"");
        }

        if (!this.title.isEmpty()) {
            sb.append(" title=\"").append(this.title).append("\"");
        }

        if (!this.style.isEmpty()) {
            sb.append(" style=\"").append(this.style).append("\"");
        }

        sb.append(">");
        sb.append(this.nameHtml);
        sb.append("</label>");

        return sb.toString();
    }
}
