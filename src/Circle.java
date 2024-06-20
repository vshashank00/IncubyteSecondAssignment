public class Circle {
    private double radius;
    private String color;
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public Circle(){
        setRadius(2.99);
        setColor("green");

    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;

    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;

    }

    public double areaOfCircle(){
        return radius*radius*Math.PI;
    }


//    [6:36 PM] Ketan Jobanputra (Unverified) (External)
//    Create a Circle class
//
//    which has following instance variables
//
//                    radius as double
//
//    color as String
//
//    it has two constructors
//
//- one accepts radius, color as parameter, and
//
//- one does not accept any parameters (no parameter constructor)
//
//    It has the following methods
//
//- getter and setter for radius(2 methods)
//
//- getter and setter for color (2 methods)
//
//- calculate the area (radius*radius*Math.PI)(1 method) this method
//
//    returns area in type double
//
//    Then you create another class (having main method). CircleDemo
//
//    Inside this class,
//
//            - Create two objects of Circle and using two constructors defined above
//
//- provide different radius and color.
//
//- Print radius, color and area of all the two circles on console.

}
