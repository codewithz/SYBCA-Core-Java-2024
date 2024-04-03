

public class VetRunner {
    
    public static void main(String[] args) {
        
        VetClinic clinic=new VetClinic();

        Animal elephant=new Elephant();
        clinic.treat(elephant);

        Dog dog=new Dog();
        clinic.treat(dog);

        clinic.treat(new Cat());
        



    }
}
