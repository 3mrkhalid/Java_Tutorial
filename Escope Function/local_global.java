public class local_global {

    // This is a global variable, accessible throughout the class
    static int Globalvar = 100;

    public static void main(String[] args) {

        // This is a local variable, accessible only within the main method
        int localvar = 100;

        // This declaration of Globalvar within the main method creates a local variable,
        // which shadows (hides) the global variable with the same name.
        int Globalvar = 500; // The local variable Globalvar takes precedence over the global variable.
        
        // This will display the value of the local Globalvar, which is 500.
        System.out.println(Globalvar); 
        // Explanation: The global variable Globalvar is shadowed within the main method.
        // When accessed here, the local Globalvar is used.

        // Demonstrating the scope of a local variable
        /*
        {
            int localvar = 100;  // This is a local variable, scoped to this block only
        } // After the block ends, the localvar variable is destroyed.
        */

        // Accessing localvar outside its block will cause an error
        // System.out.println(localvar); // Error: localvar is out of scope.

        // Calling the display method, which uses the global Globalvar
        display(); // This will display 100, the value of the global Globalvar.

        // Accessing the global Globalvar explicitly using the class name
        System.out.println(local_global.Globalvar); 
        // Explanation: Here, we bypass the local variable by explicitly referring to
        // the global Globalvar using the class name.
    }

    public static void display() {
        // This will display the value of the global variable Globalvar
        System.out.println(Globalvar); // Displays 100 (global variable)
    }

    // This method demonstrates that local variables defined in one method
    // cannot be accessed in another method.
    /*
    public static void FN2() {

        ! This will cause an error because localx is defined only in the main method

        System.out.println(localx); // Error: localx cannot be resolved to a variable
    }
    */
}

