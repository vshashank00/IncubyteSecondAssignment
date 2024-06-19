public class Volumne {
    public static void main(String[] args) {
        Cylinder cylinder1=new Cylinder(8.99,"purple",8.6);
        Cylinder cylinder2=new Cylinder();
        Cylinder cylinder3=new Cylinder();
        cylinder2.setHeight(2.66);

        System.out.println(cylinder1.getVolume());
        System.out.println(cylinder2.getVolume());
        System.out.println(cylinder3.getVolume());


    }
}
