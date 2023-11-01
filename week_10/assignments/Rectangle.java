package week_10.assignments;


//UML Class Diagram
/**************************************************
 *               Rectangle                         *
 * ------------------------------------------------*
 * width: double                                   *
 * height: double                                  *
 * Rectangle()                                     *
 * Rectangle(newWidth: double, newHeight: double)  *
 * getArea(): double                               *
 * getPerimeter(): double                          *
 ***************************************************/

public class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle(){
    }

    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return (width + height) * 2;
    }
}
