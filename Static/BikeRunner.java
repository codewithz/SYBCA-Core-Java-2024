

public class BikeRunner {
    
    public static void main(String[] args) {
        
        Bike b;
        b=new Bike();
        String name=b.whatBike();
      

        String bikeName=Bike.whatBike();
        System.out.println("Bike Name:"+bikeName);
        b.ride();

    }
}
