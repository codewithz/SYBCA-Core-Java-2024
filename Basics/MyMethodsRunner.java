public class MyMethodsRunner {
    
    public static void main(String[] args) {
        
        MyMethods m=new MyMethods();

        m.m1();
        m.add(3, 4);
        int gst=m.getGST();
        System.out.println("GST Recieved:"+gst);
        int sq=m.square(5);
        System.out.println("Square is "+sq);

    }

}
