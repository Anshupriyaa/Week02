class Employee{
    //Attributes of Employee
    String name;
    int id;
    double salary;

    // Constructor for Employee
    Employee(String name,int id,double salary){

        this.name=name;
        this.id=id;
        this.salary=salary;
    
    }

    // method to display details
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary: "+salary);
    }
}

//Here we are inheriting properties of Employee class in Manager class
class Manager extends Employee{
    // Attribute of Manager
    int teamSize;
    
    // constructor
    Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    // method
    void Display(){
        super.Display();
        System.out.println("TeamSize: "+teamSize);
    }
}
// Here also we are inheriting the properties of Employee to Developer
class Developer extends Employee{
    //Attribute
    String programmingLanguage;

    //Constructor
    Developer(String name,int id,double salary,String programmingLanguage){
    super(name,id,salary);
    this.programmingLanguage=programmingLanguage;
    }

    // Method
    void Display(){
        super.Display();
        System.out.println("Programming language used by developer: "+programmingLanguage);
    }
}

// Intern class is inheritng the properties of Employee
class Intern extends Employee{
    //Attribute
    String project;
    int duration;

    //Constructor
    Intern(String name,int id,double salary,String project, int duration){
        super(name,id,salary);
        this.project=project;
        
        this.duration=duration;
    }

    // Method
    void Display(){
        System.out.println("Project Assigned: "+project);
        super.Display();
        System.out.println("Duration of internship is: "+duration);
    }
}

public class Main{
    public static void main(String[] args){
        System.out.println("Details of Manager");
        // instance of Manager class
        Manager manager=new Manager("Shamiksha",101,3000000,12);
        manager.Display();

        // Instance of Developer class
        System.out.println("\nDetails of Developer");
        Developer dev=new Developer("Anshu",101,100000,"Java");
        dev.Display();

        //Instance of Intern class
        System.out.println("\nDetails of Intern");
        Intern intern=new Intern("ARPITA",102,200.0,"Car Rental System",1);
        intern.Display();


    }
}
