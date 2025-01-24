 class Vehicle{
    //Attribute of vehicle
    int maxSpeed;
    String fuelType;

    // constructor of Vehicle
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
// method to display information
    void displayInfo(){
       System.out.println("maxSpeed: "+maxSpeed);
       System.out.println("fuelType: "+fuelType); 
    }

}
// Car class is inheriting Vehicle
class Car extends Vehicle{
    // attribute
     int seatCapacity;
     String color;
     String company;

     // constrictor
     Car(int maxSpeed,String fuelType,int seatCapacity,String color,String company){
        super(  maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
        this.color=color;
        this.company=company;
     }

     // method
     void displayInfo(){
        super.displayInfo();
        System.out.println("seatCapacity: "+seatCapacity);
        System.out.println("color: "+ color);
        System.out.println("company: "+company);
     }
}
// Truck is inheriting vehicle
class Truck extends Vehicle{
    int numberOfWheel;
    int sizeOfContainer;

    // constructor
    Truck(int maxSpeed,String fuelType,int numberOfWheel,int sizeOfContainer){
        super(maxSpeed,fuelType );
        this.numberOfWheel=numberOfWheel;
        this.sizeOfContainer=sizeOfContainer;
        
    }

    // method
    void displayInfo(){
        super.displayInfo();
        System.out.println("numberOfWheel: "+numberOfWheel);
        System.out.println("sizeOfContainer: "+sizeOfContainer);
    }
}
// Motorcycle is inheriting Vehicle
class Motorcycle extends Vehicle{
    // Attribute
    int price;
    int millage;
// constructor
    Motorcycle(int maxSpeed,String fuelType,int price,int millage){
        super(maxSpeed,fuelType);
        this.price=price;
        this.millage=millage;
    }
// method
    void displayInfo(){
        super.displayInfo();
        System.out.println("price: "+price);
        System.out.println("millage: "+millage);
    }
}

public class Main{
    public static void main(String[] args){
        //Instance of car class
       System.out.println("Details of car: ");
        Car car=new Car(120,"Petrol",7,"gilver","Brezza");
        car.displayInfo();

        // Instance of truck class
        System.out.println("\nDetails of Truck: ");
        Truck truck=new Truck(200, "Diesal",10 ,50 );
        truck.displayInfo();

        // Instance of MotorCycle
        System.out.println("\nDetails of MotorCycle: ");
        Motorcycle motorcycle=new Motorcycle(200, "Petrol", 100000, 16);
        motorcycle.displayInfo();


    }

}
