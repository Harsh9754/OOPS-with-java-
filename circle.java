public class circle {
    private static double radius;
    private String color;

    public circle(){
        radius = 2.0;
        color = "red";
    }
    public circle (double r){
        radius = r;
        color = "red";
    }
    public static double getRadius(){
        return radius;
    }
    public static double getArea(){
        return(3.14*radius*radius);
    }
    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.println(getRadius());
        System.out.println(getArea());

        circle c2 = new circle(5.0);
        System.out.println(getRadius());
        System.out.println(getArea());
    }
    
}
