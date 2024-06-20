public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height=height;


    }
    public Cylinder(){
        setHeight(5.2);
    }
    public  double areaOfCircle(){
//        2π r h + 2π r²
        return (2*Math.PI*getRadius()*height) +(2*Math.PI*getRadius()*getRadius());

    }
    public  double getVolume(){
        return height*areaOfCircle();
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//    reate a Cylinder class, inherit it from Circle
//    having "height" as additional attribute of type double
//    two constructors,
//- one with three parameters, radius,color and height and
//- other without any parameter(no parameter constructor)
//
//    the following behaviours/methods
//- setHeight() and getHeight()
//            - Override the getArea() method in Circle to implement area of the Cylinder
//- getVolume() which uses getArea() method of circle (height * area of circle)
//
//- create another class having main method.
//    Create 3 objects of Cylinder having different
//    values of color, radius and height, area and volume.
}
