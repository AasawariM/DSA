
// public means accessible from anywhere
// The JVM must be able to access this class to run the program

// class is a blueprint for creating objects
// Every Java program runs inside a class

// demo is the class name , Must match the file name if the class is public
public class Demo {

  // main method: entry point of Java program
  public static void main(String[] args) { //String array
            System.out.println("Original main");
    
  }
  // Main Method
  
  // Main method must be public so JVM can invoke it.

//why static =  JVM does not create an object of the class ,
// static allows JVM to call main() without object creation
// why void = main() does not return anything
// JVM does not expect any value back

// main = main is a predefined method name
// JVM always looks for this exact name to start execution main() here is case sensitive

//String[] args =  Used to pass command-line arguments
// args is an array of String , bcz Command-line input is always text
 
// method body  = {} = Code execution starts here

// Java program execution starts from the main method. It is public so JVM can access it, 
// static so it can be called without object creation,
//  void because it returns nothing, and String[] args is used for command-line arguments.




public static void main(String args) { //Single String
        System.out.println("Another overloaded main");
    }
}

// Can main() be overloaded?
// Yes
// But JVM calls only original signature
// Method overloading means defining multiple methods with the same name in the same class but with different parameter lists.
//  JVM supports overloading, but for program execution it only calls the main method with the exact signature.

// overloading  = Compile-time

// Can main() be final?
// Yes

// Can main() be private?
// No
// JVM cannot access it.