class Car{

    String color;
    String name;
    float price;

    Car(){
        System.out.println("Car () invoked");
    }

    Car(String c,String n){
        color=c;
        name=n;
    }

    public void display(){
        System.out.println("Car name:"+name);
        System.out.println("Car Price:"+price);
        System.out.println("Car Color:"+color);
    
    }




}