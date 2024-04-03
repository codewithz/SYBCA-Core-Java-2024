

public class ERunner {
    public static void main(String[] args) {
        
        Elephant e=new Elephant();
        e.eat();
        e.sleep();
        e.breathe();

        System.out.println("----------- After Super Class Points to Sub Class--------");
        System.out.println("----------- Animal a=new Elephant()----------------");

        Animal a=new Elephant();
        a.breathe();
        a.eat();
        


    }
}
