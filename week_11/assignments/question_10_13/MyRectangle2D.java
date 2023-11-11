package week_11.assignments.question_10_13;

public class MyRectangle2D {
    private double x, y, width, height, right, left, top, bottom;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    MyRectangle2D(){
        this(0,0,1,1);
    }

    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.right = x + width / 2;
        this.left = x - width / 2;
        this.top = y + height / 2;
        this.bottom = y - height / 2;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width + height) * 2;
    }

    public boolean contains(double x, double y){
        return  x <= this.right &&
                x >= this.left &&
                y <= this.top &&
                y >= this.bottom;
    }

    public boolean contains(MyRectangle2D r){
        return this.left <= r.getLeft() && this.right >= r.getRight() && this.top >= r.getTop() && this.bottom <= r.getBottom();
    }

    public boolean overlaps(MyRectangle2D r){

        return  this.left > r.getLeft() && this.top < r.getTop() && this.right >= r.getRight() &&
                        this.bottom <= r.getBottom() && r.getRight() > this.left && r.getBottom() < this.top ||
                this.left > r.getLeft() && this.top >= r.getTop() && this.right >= r.getRight() &&
                        this.bottom > r.getBottom() && r.getRight() > this.left && r.getTop() > this.bottom ||
                this.left <= r.getLeft() && this.top < r.getTop() && this.right < r.getRight() &&
                        this.bottom <= r.getBottom() && r.getLeft() < this.right && r.getBottom() < this.top ||
                this.left <= r.getLeft() && this.top >= r.getTop() && this.right < r.getRight() &&
                        this.bottom > r.getBottom() && r.getLeft() < this.right && r.getTop() > this.bottom;
    }
}
