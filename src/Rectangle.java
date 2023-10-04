public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPerimeter() {
        return 2 * (this.height + this.width);
    }

    public int getArea() {
        return this.width * this.height;
    }
}
