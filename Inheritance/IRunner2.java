

public class IRunner2 {
    public static void main(String[] args) {
        
        Parent p=new Parent();
        Child c=new Child();

        System.out.println("------- Super Classes---------");

        Class c1=c.getClass();
        System.out.println("Super Class for Child is "+c1.getSuperclass().getName());

        Class c2=p.getClass();
        System.out.println("Super Class for Parent is "+c2.getSuperclass().getName());

    }
}
