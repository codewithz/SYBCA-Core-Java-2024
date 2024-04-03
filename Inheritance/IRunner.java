

public class IRunner {
    public static void main(String[] args) {
        
        A a=new A();
        a.m1();
        a.m2();

        System.out.println("====== Called using object of B =============");

        B b=new B();
        b.m1();
        b.m2();
        b.m3();
        b.m4();

        Class c2=a.getClass();
        System.out.println("Super Class for Parent is "+c2.getSuperclass().getName());


    }
}
