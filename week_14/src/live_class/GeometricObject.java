package live_class;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject (String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on: " + dateCreated +
                "\nColor: " + color +
                "\nFilled: " +filled;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public static void max(GeometricObject o1 , GeometricObject o2) {
        switch (o1.compareTo(o2)) {
            case 1 -> System.out.println(o1);
            case -1 -> System.out.println(o2);
            case 0 -> System.out.println("They are equal");
        };
    }

    public abstract boolean equals(GeometricObject object);
}
