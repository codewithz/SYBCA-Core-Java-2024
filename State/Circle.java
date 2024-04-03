
public class Circle {
    
    int radius;

    public void setRadius(int radius){
        this.radius=radius;
    }

    public void area(){
        double area=Math.PI*radius*radius;
        System.out.println("Area for circle with radius "+radius+" is "+area);
    }



}
