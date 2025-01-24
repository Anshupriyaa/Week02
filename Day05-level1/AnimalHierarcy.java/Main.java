class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    void makeSound() {
        System.out.println("Animal is making sound");
    }
    void DisplayAnimal(){
        System.out.println("Name"+name);
        System.out.println("Age"+age);
    }
}
// Dog is a class and it is inheriting the properties of Animal
class Dog extends Animal {  // extend keyword is used for inheriting
   // Attributes of Dog class
    String breed;
    int numberOfLeg;

    // Constructor of Dog class
    Dog(String breed, int numberOfLeg) {
        super("Silky", 5);
        this.breed = breed;
        this.numberOfLeg = numberOfLeg;
    }
    @Override
    void makeSound() {
        System.out.println("Dogs barks");
    }
    void DisplayAnimal(){
        System.out.println("Breed of Dog is: "+breed);
        System.out.println("Number Of legs: "+numberOfLeg);
    }
}

// Cat class is inheriting Animal class
class Cat extends Animal {
    // Attribute of Cat
    String color;
 
    // Constructor of cat
    Cat(String color) {
        super("miloo", 3);
        this.color = color;
    }
    @Override
    void makeSound() {
        System.out.println("Cats meows");
    }
    void DisplayAnimal(){
        System.out.println("Color of cat is: "+color);
        
    }
}

// Birds are inheriting Animal
class Birds extends Animal{
    //Attribute of Birds
    int numberOfWings;

    //Constructor of Birds class
    Birds(int numberOfWings){
        super("Eagle",1);
        this.numberOfWings=numberOfWings;
    }
    
    void fly(){
        System.out.println("Birds can fly");
    }
    @Override
    void makeSound(){
        System.out.println("Birds are chirping");
    }


    void DisplayAnimal(){
        System.out.println("Number of Wings "+numberOfWings);
        
    }
}

    

public class Main{
    public static void main(String[] args){
        System.out.println("Details of Dog: ");
        //Instance of Dog class
        Dog dog=new Dog(" =SHIT-ZU",  4);
        dog.makeSound();// method called
        dog.DisplayAnimal();// method called

    
        System.out.println("\nDetails of Cat: ");
        //Instance of cat class
        Cat cat=new Cat("White");
        cat.makeSound();
        cat.DisplayAnimal();

        System.out.println("\nDetails of bird: ");
        //Instance of birds class
        Birds bird=new Birds(2);
        bird.fly();
        bird.makeSound();
        bird.DisplayAnimal();
    }
}
    
    
    
    

    
