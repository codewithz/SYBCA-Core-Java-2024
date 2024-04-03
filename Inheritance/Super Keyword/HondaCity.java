

public class HondaCity extends Car {

    int minimumMileage=15;

    HondaCity(){
        super("Black");
        System.out.println("Honda City - invoked");
    }


    public void run(){
        super.run();
        System.out.println(super.minimumMileage);
    }
    
}
