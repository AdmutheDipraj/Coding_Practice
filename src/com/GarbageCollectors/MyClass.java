package com.GarbageCollectors;

public class MyClass {

    // Some instance variables
    private int data;

    // Constructor
    public MyClass(int data) {
        this.data = data;
    }

    // Custom method
    public void processData() {
        System.out.println("Processing data: " + data);
    }

    // Finalize method
    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup code here
            System.out.println("Finalizing MyClass object with data: " + data);
        } finally {
            // Call the finalize method of the superclass
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass(42);

        // Using the object
        myObject.processData();

        // Setting the reference to null, making the object eligible for garbage collection
        myObject = null;

        // Requesting garbage collection (note: it's not guaranteed when it will happen)
        System.gc();
    }
}
