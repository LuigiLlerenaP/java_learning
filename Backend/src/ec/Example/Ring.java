package ec.Example;

public class Ring {
    private int width;
    private int height;

    public Ring(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea(){
        return this.width * this.height;
    }
    public  int calculatePerimeter(){
        return 2*(this.width + this.height);
    }
}


