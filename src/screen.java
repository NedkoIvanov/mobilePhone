public class screen {
    private int size;
    private int colors;

    public screen(int size,int colors){
        this.size = size;
        this.colors = colors;
    }

    public int getColors() {
        return colors;
    }

    public int getSize() {
        return size;
    }

    public void setColors(int colors) {
        this.colors = colors;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "screenSize=" + size + ", screenColors=" + colors;
    }
}
