package week_10.assignments;
//UML Class Diagram
/************************************************************
 *               Fan                                        *
 * ---------------------------------------------------------*
 * SLOW: int                                                *
 * MEDIUM: int                                              *
 * FAST: int                                                *
 * speed: int                                               *
 * on: boolean                                              *
 * radius: double                                           *
 * color: String                                            *
 * ---------------------------------------------------------*
 * +Fan()                                                   *
 * +getSpeed() : int                                        *
 * +setSpeed(speed: int)                                    *
 * +isOn() : boolean                                        *
 * +setOn(on: boolean)                                      *
 * +getRadius() : double                                    *
 * +setRadius(radius: double)                               *
 * +getColor() : String                                     *
 * +setColor(color: String)                                 *
 * +toString() : String                                     *
 ************************************************************/
public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;

    private boolean on = false;

    private double radius = 5;

    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Fan(){}

    @Override
    public String toString(){
        return (
                ((this.on) ?  "\nFan speed  : " + speed : "") +
                              "\nFan color  : " + color +
                              "\nFan radius : " + radius +
                ((!this.on) ? "\nFan is off" : "")
        );
    }
}
