class Book { // Book superclass
    private String title;
    private int publicationYear;

    // constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Author subclass inheriting properties of Book superclass
class Author extends Book {

    // attributes
    private String name;
    private String biography;

    // constructor
    public Author(String title, int publicationYear, String name, String biography) {
        super(title, publicationYear);
        this.name = name;
        this.biography = biography;
    }

    // Override the displayInfo method from Book superclass
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Biography: " + biography);
    }
}

// Main class where the main code runs
 public class Main {
    public static void main(String[] args) {

        // Create object
        Author bookAuthor = new Author("Java Basics", 2022, "John Smith", "Expert Programmer");
        // call the method from the class
        bookAuthor.displayInfo();

        
    }
}
