package ec.OOP.abstractE.form.elementos;

public class TextareaForm extends ElementForm{
    private int row;
    private int col;

    public TextareaForm(String nameHtml) {
        super(nameHtml);
    }

    public TextareaForm(String nameHtml, int col, int row) {
        super(nameHtml);
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String drawHtml() {
        return "<textarea name=\""+this.nameHtml+"\" id=\""+this.id+"\" cols=\""+this.getCol()+"\" rows=\""+this.getRow()+"\">"+this.valueHtml+"</textarea>";
    }
}
