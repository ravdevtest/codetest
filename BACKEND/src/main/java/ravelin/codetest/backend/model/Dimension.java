package ravelin.codetest.backend.model;

// Type following the specification.
public class Dimension {

    private String width;

    private String height;

    public Dimension() {
    }

    public Dimension(String width, String height) {
        this.width = width;
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dimension [width=" + width + ", height=" + height + "]";
    }

}
