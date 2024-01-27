public class InheritanceLearning {
    public static void main(String[] args){
        // creation of car 
        Car car=new Car("Car", "Diesel");
        SedanCar sedanCar=new SedanCar("hyundai Verna","Petrol");
        SedanCar sedanCar2=new SedanCar("Honda City","Diasel");
        SedanCar sedanCar3=new SedanCar("Skoda Slavia","Petrol");
        sedanCar.is_manual=true;
        sedanCar.seats=5;
        System.out.println(sedanCar.is_manual);
        System.out.println(sedanCar.name);
        System.out.println(sedanCar2.name);
        System.out.println(sedanCar3.name);


    }
}

class Car{
    String name;
    String type;
    
    public Car(String name,String type){
        this.name=name;
        this.type=type;
    }

    public Car(){

    }

}


class SedanCar extends Car{

    int seats;
    boolean is_manual;
    boolean soundSystem;
    boolean smart_internet;

    public SedanCar(String name, String type) {
        super(name, type);
    }
    public SedanCar(){

    }
}

class SUVCar extends Car{

    double groundClearance;
    int capacity;

    public SUVCar(String name, String type) {
        super(name, type);
    }
    
}


class SportsCar extends Car{

    public SportsCar(String name, String type) {
        super(name, type);
    }
    
}
