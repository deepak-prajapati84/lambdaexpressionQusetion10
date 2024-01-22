// Define an interface
interfa`ce Printable {
    void print();
}

// Implement the interface in a class
class polymorphism implements Printable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

// Using the interface polymorphically
Printable printable = new polymorphism();
printable.print();