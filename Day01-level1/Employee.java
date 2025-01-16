
// made one Employee class for storing name,id,salary
public class Employee {
    private String name;
    private int id;
    private int salary;

    // made Employee method tp store name,id and salary of the employee
    public Employee(String name, int id, int salary) {
        this.name = name;// this. is used to refer current object
        this.id = id;
        this.salary = salary;
    }

    // method for displaying the details of Employee
    public void DisplayDetails(String name, int id, int salary) {
        System.out.println("Name of employee is: " + name);
        System.out.println("Id of employee is: " + id);
        System.out.println("Salary of employee is: " + salary);
    }

    // main method
    public static void main(String[] args) {
        
         
        Employee e1=new Employee("Anshu priya", 21, 100000);
        System.out.println("Name of the employee is: " +e1.name);
        System.out.println("Id of employee is: "+e1.id);
        System.out.println("Salary of employee is: "+e1.salary);

        
    }
}